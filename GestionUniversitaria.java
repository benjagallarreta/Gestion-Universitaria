import java.util.ArrayList;
import java.util.HashMap;
public class GestionUniversitaria {

    private HashMap<Integer,Alumno> alumnosTotales;
    private ArrayList<Carrera> carreras;
    private StrategyPlanEstudio strategy;

    public GestionUniversitaria() {

    }

    public void validarAlumno(Alumno alumno) {
        int key = alumno.getLegajo();
        alumnosTotales.put(key,alumno); // HashMap.put(key,object); 
    }

    private Alumno buscarAlumno(Alumno alumno) {
        int key = alumno.getLegajo();
        alumno = alumnosTotales.get(key);
        return (alumno);
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }

    private Carrera buscarCarrera(String nombre) {
        String obtenido;
        for (int i = 0; i < carreras.size(); i++) {
            obtenido = carreras.get(i).getNombre();
            if (obtenido.equals(nombre)) {
                return carreras.get(i);
            } 
        }
        return null;
    }

    public void inscrbirCarrera(Alumno a, Carrera c) {
        a = buscarAlumno(a);
        if (buscarCarrera(c.getNombre()) != null) {
            Carrera.addAlumno(a);
        }
    }

    public void agregarMateria(Carrera carrera, Materia materia) {
        buscarCarrera(carrera.getNombre());
        carrera.addMaterias(materia);
    }

    public void inscribirMateria(Materia materia, Alumno alumno) {
        if (strategy.verificarCondicion(materia,alumno)) {
            materia.inscribirAlumno(alumno);
        };
    }
    
    public static Boolean verficarFinalizacion(Alumno alumno) {
        for (MateriaCursada cursada : alumno.getHistoriaAcademica()) {
            if (cursada.getEstado() != MateriaCursada.Estado.aprobado) {
                return false; // Hay al menos una no aprobada
            }
        }
        return true; // Todas están aprobadas
    }
    
}
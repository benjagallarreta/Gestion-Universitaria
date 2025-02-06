import java.util.LinkedList;

public class Carrera {
    
    private String nombre;
    private int cuatrimestresTotales;
    private LinkedList<Materia> materiasContenidas;
    private static LinkedList<Alumno> alumnosInscriptos;

    public Carrera() {

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCuatrimestresTotales(int cuatrimestresTotales) {
        this.cuatrimestresTotales = cuatrimestresTotales;
    }

    public int getCuatrimestresTotales() {
        return cuatrimestresTotales;
    }

   public void addMaterias(Materia materia) {
        this.materiasContenidas.add(materia);
   }

   public static void addAlumno(Alumno alumno) {
        alumnosInscriptos.add(alumno);
   }
}
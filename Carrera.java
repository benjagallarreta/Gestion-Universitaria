import java.util.ArrayList;

public class Carrera {
    
    private String nombre;
    private int cuatrimestresTotales;
    private static ArrayList<Materia> materiasContenidas;
    private static ArrayList<Alumno> alumnosInscriptos;

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
        materiasContenidas.add(materia);
   }

   public static void addAlumno(Alumno alumno) {
        alumnosInscriptos.add(alumno);
   }

   public static String getMaterias() {
    StringBuilder nombres = new StringBuilder();
    for (Materia materia : materiasContenidas) {
        nombres.append(materia.getNombre()).append("\n");
    }
    return nombres.toString();
}


}
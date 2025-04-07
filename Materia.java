import java.util.ArrayList;

public class Materia {
    
    private String codigo,nombre,tipo;
    private int cuatrimestre;
    public ArrayList<Materia> correlativas;

    public Materia() {
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() { 
        return codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void agregarCorrelativa(Materia materia) {
        this.correlativas.add(materia);
    }
    
}

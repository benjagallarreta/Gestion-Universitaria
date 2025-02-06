public class MateriaCursada {
    
    private Materia materia;
    private String estado;

    public MateriaCursada(Materia materia, String estado) {
        this.materia = materia;
        this.estado = estado;
    }

    public Materia getMateriaCursada() {
        return materia;
    }

    public String getEstado() {
        return estado;
    }

}

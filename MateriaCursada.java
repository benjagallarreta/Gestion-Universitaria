public class MateriaCursada extends Materia {

    private Materia materia;
    private Estado estado;

    public enum Estado {
        indefinido("Indefinido"),
        cursando("En Curso"),
        regular("Regular"),
        aprobado("Aprobado");

        private final String valor;

        Estado(String valor) {
            this.valor = valor;
        }

        @Override
        public String toString() {
            return valor;
        }
    }

    @Override
    public String toString() {
        return super.getNombre() + " - " + estado;
    }

    public MateriaCursada(Materia materia) {
        this.materia = materia;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public MateriaCursada getMateriaCursada() {
        return materia;
    }
}

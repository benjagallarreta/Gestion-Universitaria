// Plan C: aprobó las cursadas de las correlativas y los finales de todas las materias de 5 cuatrimestres previos al que se quiere anotar
public class PlanC implements StrategyPlanEstudio{

    @Override
    public boolean verificarCondicion (Materia materia, Alumno alumno) {

        for (Materia correlativa : materia.getCorrelativas()) {
            boolean estaAprobada = false;
    
            for (MateriaCursada cursada : alumno.getHistoriaAcademica()) {
                if (cursada.getMateriaCursada().getNombre().equals(correlativa.getNombre()) 
                    && (cursada.getEstado() == MateriaCursada.Estado.regular 
                        && correlativa.getCuatrimestre() < 5)) {
                        estaAprobada = true;
                        break;
                }
            }
    
            if (!estaAprobada) {
                return false;
            }
        }
    
        return true;

    }
    
}

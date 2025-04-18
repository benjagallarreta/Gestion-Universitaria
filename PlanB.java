// Plan B - Aprobó los finales de las correlativas 
public class PlanB implements StrategyPlanEstudio {

    @Override
    public boolean verificarCondicion (Materia materia, Alumno alumno) {

        //acceder a las materias correlativas de la materia pasada como parametro
        //recorrer la lista de las materias correlativas
        //verificar si esas materias correlativas tiene como estado "aprobado"
        //inscribir alumno en caso de que esto suceda
        
        for (Materia correlativa : materia.getCorrelativas()) {
            boolean estaAprobada = false;
    
            for (MateriaCursada cursada : alumno.getHistoriaAcademica()) {
                if (cursada.getNombre().equals(correlativa.getNombre()) && 
                cursada.getEstado() == MateriaCursada.Estado.aprobado) {
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

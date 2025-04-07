// Plan B - Aprobó los finales de las correlativas 
public class PlanB implements StrategyPlanEstudio {

    @Override
    public boolean verificarCondicion (MateriaCursada materia, Alumno alumno) {

        //acceder a las materias correlativas de la materia pasada como parametro
        //recorrer la lista de las materias correlativas
        //verificar si esas materias correlativas tiene como estado "aprobado"
        //inscribir alumno en caso de que esto suceda
        
        for (Materia correlativa : materia.correlativas) {
            boolean aprobada = false;
    
            for (MateriaCursada cursada : materiasCursadas) {
                if (cursada.getMateria().equals(correlativa) &&
                    cursada.getEstado() == MateriaCursada.Estado.aprobado) {
                    aprobada = true;
                    break;
                }
            }
    
            if (!aprobada) {
                return false; // una no aprobada, salimos
            }
        }
    
        return true; // todas aprobadas
    }

}

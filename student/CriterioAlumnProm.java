package student;

public class CriterioAlumnProm implements Criterio<Alumno> {

    @Override
    public int comparar(Alumno a, Alumno b) {
        double diff = a.getNotaPromedio() - b.getNotaPromedio();
        return diff > 0 ? -1 : 0; 
    }
    
}

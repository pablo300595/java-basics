package student;

public class CriterioAlumNombre implements Criterio<Alumno> {

    @Override
    public int comparar(Alumno a, Alumno b) {
        return a.getNombre().compareTo(b.getNombre());
    }
    
}

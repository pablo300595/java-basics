package student;

import java.util.Comparator;

public class TestCriterio {
    public static void main(String[] args) {
        // Alumno arr[] = {
        //     new Alumno("Carlos", 23, 7.3),            
        //     new Alumno("Martin", 25, 4.5),
        //     new Alumno("Anastasio", 20, 9.8)
        // };

        // JAVA BOOK PAGE 123
        // Criterio<Alumno> c1 = (a, b) -> a.getNombre()
        //                                     .compareTo(b.getNombre());
        
        // Util.sort(arr, c1);
        // Util.imprimir(arr);

        // Criterio<Alumno> c2 = (a,b ) -> {
        //     double diff = a.getNotaPromedio() - b.getNotaPromedio();
        //     return diff > 0 ? -1 : 0;
        // };

        // Util.ordenar(arr, c2);
        // Util.imprimir(arr);

        Integer[] x = {2,5,3,9,7,1,6};
        Comparator<Integer> c1 = (a, b) -> {return a - b;};
        Util.ordenar(x, c1);

        Comparator<Integer> c2 = (a, b) -> {return b - a;};
        Util.ordenar(x, c2);
        Util.imprimir(x);

    }
}

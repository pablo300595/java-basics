package student;

import java.util.Comparator;

public class Util {
    public static <T extends Comparable<T>> void ordenar(T arr[], Comparator<T> cr) {
        for (int n = 0; n < arr.length; n++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (cr.compare(arr[i], arr[i+1]) > 0) {
                    T aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                }
            }
        }
    }

    public static <T> void imprimir(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

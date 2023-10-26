package auth;

import communication.Comunicador;
import communication.ComunicadorManager;
import student.Alumno;
import student.Util;
import utilities.MiColeccion;

public class MainApplication {

    public static void main(String args[]) {
        MiColeccion<String> list = new MiColeccion<>();

        list.insertar("Pedro", 0);
        list.insertar("Pablo", 0);
        list.insertar("Juan", 0);
        list.insertar("Luis", 1);
        list.insertar("Ramses", 2);

        for (int i = 0; i < list.cantidad(); i++) {
            String s = list.obtener(i);
            System.out.println(s);
        }

        Comunicador c1 = ComunicadorManager.crearComunicador();
        c1.enviarMensaje("Bankai");

        Alumno arr[] = {
            new Alumno("Alberto", 19, 4.6),
            new Alumno("Pedro", 18, 5.3),
            new Alumno("Juan", 20, 8.5)
        };

        Util.ordenar(arr);

        System.out.println("-----------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

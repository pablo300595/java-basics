package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NombresUtil {
    public static List<String> obtenerLista() {
        ArrayList<String> studentNamesList = new ArrayList<>();
        studentNamesList.add("Pablo");
        studentNamesList.add("Juan");
        studentNamesList.add("Carlos");
        return studentNamesList;
    }

    public static List<String> obtenerListaLinked() {
        LinkedList<String> studentNamesList = new LinkedList<>();
        studentNamesList.add("Pablo");
        studentNamesList.add("Juan");
        studentNamesList.add("Carlos");
        return studentNamesList;
    }
}

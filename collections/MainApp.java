package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class MainApp {
    public void showArrayListImplementation() {
        List<String> studentNamesList = NombresUtil.obtenerListaLinked();

        // foreach sirve para List, Collection, Iterador y arrays
        for (String studentName : studentNamesList) {
            System.out.println(studentName);
        }
    }

    public void showMapImplementation() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "uno");
        map.put(2, "dos");
        map.put(3, "tres");
        map.put(4, "cuatro");

        for (String number : map.values()) {
            System.out.println(number);
        }

        for (int key : map.keySet()) {
            System.out.println(key);
        }
    }

    public void showArrayToListViceversa() {
        Integer arr[] = { 1, 2, 3, 4 };
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list.size());

        List<String> studentNameList = new ArrayList<>();
        String nameArray[] = (String[]) studentNameList.toArray();
        System.out.println(nameArray.length);
    }

    public void sortListAndArray() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        String usernameList[] = { "lucas", "alfonso", "zazu" };

        Comparator<Integer> comp1 = (a, b) -> {
            return b - a;
        };
        list.sort(comp1);

        Comparator<String> comp2 = (a, b) -> {
            return b.compareTo(a);
        };
        Arrays.sort(usernameList, comp2);

        for (Integer number : list) {
            System.out.println(number);
        }

        for (String username : usernameList) {
            System.out.println(username);
        }
    }

    public void showHashMapPropertiesClass() {
        Properties props = new Properties();
        props.setProperty("nombre", "Pablo");
        props.setProperty("apellido", "Valenzuela");
        props.setProperty("fechaNacimiento", "30/05/1995");
        props.setProperty("dni", "9505306D6");
        props.setProperty("direccion", "Calcio 15");

        String fechaNacimiento = props.getProperty("fechaNacimiento");
        System.out.println(fechaNacimiento);

        // Write a file
        String filename = "./persona.properties";
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            props.store(fos, "Comentario");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Read from a file
        try {
            Properties newprops = new Properties();
            FileInputStream fis = new FileInputStream(filename);
            newprops.load(fis);

            System.out.println(newprops.getProperty("apellido"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void accessClassPath() {
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();

            String filename = "persona.properties";
            InputStream is = loader.getResourceAsStream(filename);

            Properties prop = new Properties();
            prop.load(is);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void simpleAccessFile() {
        Properties props = PropertiesUtil.getProperties("persona.properties");
        // Properties prop = PropertiesUtil.getProperties(MainApp.class);
        String apellido = props.getProperty("apellido");
        System.out.println(apellido);
    }

    // Consumer & Comparator  es una expresion lambda
    public void basicStreams() {
        List<Integer> x = Arrays.asList(1,2,3,4,5,6);
        List<String> nameList = Arrays.asList("Carlos" , "Alfredo", "Zulu");
        
        nameList.sort((a, b) -> b.compareTo(a));
        int sum = x.stream().reduce((a,b) -> a+b).get();
        
        List<Integer> oddNumbers = x.stream().filter((number) -> number % 2==0).collect(Collectors.toList());

        System.out.println("----------------basicStreams");
        nameList.stream().forEach((name) ->  System.out.println(name));
        oddNumbers.stream().forEach(number -> System.out.println(number));
        System.out.println(sum);
    }

    public void multipleOperators() {
        System.out.println("----------------complexStream");
        List<Integer> x = Arrays.asList(1,2,3,4,5,6);
        int sum = x.stream()
            .filter((number) -> number % 2==0)
            .reduce((a,b) -> a+b)
            .get();
        System.out.println("Complex sum: " + sum);
    }

    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.showArrayListImplementation();
        app.showMapImplementation();
        app.sortListAndArray();
        app.showHashMapPropertiesClass();
        app.accessClassPath();
        app.simpleAccessFile();
        app.basicStreams();
        app.multipleOperators();
    }
}

package animals;

public class MainApp {
    public static void main(String args[]) {
        Swimmer perro = SwimmerManager.createSwimmer();
        perro.canDive();
        // perro.canSwim();
    }
}

package animals;

public class Wolf extends Canid implements Swimmer {
    @Override
    public void canSwim() {
        System.out.println("Wolf Swiming!!!");
    }

    @Override
    public void canDive() {
        System.out.println("Wolf Diving!!!");
    }
}

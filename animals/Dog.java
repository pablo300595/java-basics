package animals;

public class Dog extends Canid implements Swimmer {

    @Override
    public void canSwim() {
        System.out.println("Dog Swimming 2!!");
    }

    @Override
    public void canDive() {
        System.out.println("Dog Diving 2!!");
    }

}

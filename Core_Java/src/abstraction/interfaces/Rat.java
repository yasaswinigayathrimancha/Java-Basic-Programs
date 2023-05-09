package abstraction.interfaces;

public class Rat implements Animal {
    @Override
    public void eat() {
        System.out.println("Rat is eating.");
    }

    @Override
    public void move() {
        System.out.println("Rat is moving.");
    }
}
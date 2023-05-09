package abstraction.interfaces;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving.");
    }
}
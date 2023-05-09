package abstraction.shape;


public abstract class Shape {
    public abstract double area(); // abstract method
    public void display() { // non-abstract method
        System.out.println("This is a shape.");
    }
}





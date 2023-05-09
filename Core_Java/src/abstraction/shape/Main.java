package abstraction.shape;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display(); // This is a shape.
        double area = c.area();
        System.out.println("Area of circle: " + area);
    }
}
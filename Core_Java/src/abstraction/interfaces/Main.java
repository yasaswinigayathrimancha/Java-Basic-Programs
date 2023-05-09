package abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // Dog is eating.
        d.move(); // Dog is moving.
    }
}
/* Interface: An interface is a collection of abstract methods.
  An interface can be implemented by any class, 
  and the implementing class must provide an implementation 
  for all the abstract methods in the interface. */

/* In this example, 
 the Animal interface defines two abstract methods eat() and move().
  The Dog class implements the Animal interface and provides an implementation for both the methods. 
  The Dog class can be treated as an Animal object and can be used wherever an Animal object is expected.
 */
 
package oop_java.oopconcept;

public class CarSpeed {
		  // Create a fullThrottle() method
		  public void fullThrottle() {
		    System.out.println("The car is going as fast as it can!");
		  }

		  // Create a speed() method and add a parameter
		  public void speed(int maxSpeed) {
		    System.out.println("Max speed is: " + maxSpeed);
		  }

		  // Inside main, call the methods on the myCar object
		  public static void main(String[] args) {
			  CarSpeed myCar = new CarSpeed();     // Create a myCar object
		    myCar.fullThrottle();      // Call the fullThrottle() method
		    myCar.speed(200);          // Call the speed() method
		  }
		}


package oop_java.oopconcept;
//Create a  class
public class  StaticVsPublicMethods{
	 // Static method
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

	  // Main method
	  public static void main(String[] args) {
	    myStaticMethod(); // Call the static method
	    // myPublicMethod(); This would compile an error

	    StaticVsPublicMethods myObj = new StaticVsPublicMethods(); // Create an object of Main
	    myObj.myPublicMethod(); // Call the public method on the object
	  }
	}
//It describes the diff b/w Static and Public Methods
// we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects
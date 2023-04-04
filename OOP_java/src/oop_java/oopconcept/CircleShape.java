package oop_java.oopconcept;

public class CircleShape {

	public static void main(String[] args) {
		
		Circle1 c1 = new Circle1(5);
		
		Circle2 c2 = new Circle2(5);
		
		System.out.println("First Circle:\n" + c1.calAreaOfCircle());
		System.out.println(c1.calPerimeterOfCircle());
		
		System.out.println("Second Circle:\n" + c2.calAreaOfCircle());
		System.out.println(c2.calPerimeterOfCircle());
	}

}






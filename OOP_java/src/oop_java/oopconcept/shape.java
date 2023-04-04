package oop_java.oopconcept;

public class shape {

	public static void main(String[] args) {
		
		Rectangle rec1= new Rectangle(5, 4);
		
		Rectangle1 rec2 = new Rectangle1(3, 4);
		
		System.out.println("First rectangle:\n" + rec1.calArea());
		System.out.println(rec1.calPerimeter());
		
		System.out.println("Second rectangle:\n" + rec2.calArea());
		System.out.println(rec2.calPerimeter());
	}

}

package oop_java.oopconcept;

public class Rectangle1 {
	private int length;
	private int breadth;

	public Rectangle1() {

	}

	public Rectangle1(int len, int brd) {
		length = len;
		breadth = brd;
	}

	public void setterOfLength(int len) {
		length = len;
		System.out.println("Its Setter of length");
	}

	public void setterOfBreadth(int brd) {
		breadth = brd;
		System.out.println("Its Setter of breadth");

	}

	public int getterOfLength() {
		return length;
	}

	public int getterOfBreadth() {
		return breadth;
	}

	int calArea() {
		return length * breadth;
	}

	int calPerimeter() {
		return (2 * (length + breadth));
	}
}

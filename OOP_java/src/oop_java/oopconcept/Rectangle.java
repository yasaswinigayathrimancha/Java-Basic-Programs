package oop_java.oopconcept;

public class Rectangle {
            int length;
            int breadth;
            
	public Rectangle(int len,int brd) {
        length=len;
        breadth=brd;
	}
  int calArea() {
	  return length*breadth;
  }
  int calPerimeter() 
  {
	  return 2*(length+breadth);
  }
}

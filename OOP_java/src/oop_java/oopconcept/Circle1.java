package oop_java.oopconcept;

public class Circle1{
            int radius;
            
	public Circle1(int rad) {
        radius =rad;
	}
  double calAreaOfCircle() {
	  return (3.14*(radius^2));
  }
  double calPerimeterOfCircle() 
  {
	  return 2*3.14*radius;
  }
}

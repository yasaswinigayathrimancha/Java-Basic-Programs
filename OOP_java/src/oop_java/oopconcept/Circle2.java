package oop_java.oopconcept;

public class Circle2 {
      private int radius;
      
      public Circle2() {
    	  
      }
      public Circle2(int rad) {
    	 int radius =rad;
      }
     public void setRadius(int rad) {
    	 radius=rad;
     }
     
     public int getRadius() {
    	 return radius;
     }
     double calAreaOfCircle() {
   	  return (3.14*(radius^2));
     }
     double calPerimeterOfCircle() 
     {
   	  return 2*3.14*radius;
     }
}


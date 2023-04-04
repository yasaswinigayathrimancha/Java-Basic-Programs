package task2.task2;
import java.util.*;
public class Percentagecalculation
{
  public static void main (String args[])
  {
    int a, b, c;
      System.out.println ("enter 3 subject values: ");
    Scanner sc = new Scanner (System.in);
      a = sc.nextInt ();
      b = sc.nextInt();
      c = sc.nextInt ();
      double aggregate=percentCal(a, b, c);
      if(aggregate< 50)
  	    System.out.println ("The Grade is F");
  	else if (aggregate>= 90 )
          System.out.println ("The Grade is A");
      else if (aggregate>= 70 & aggregate<90)
          System.out.println ("The Grade is B");
      else if (aggregate>=50 & aggregate<70)
          System.out.println ("The Grade is C");
      System.out.println ("percentage of 3 subjects is:" +percentCal(a, b, c));
  }
  public static double percentCal(int a, int b,int c) {
    double percentage;
    percentage = ((a + b + c) / 3.0);
    return percentage;
  }
}

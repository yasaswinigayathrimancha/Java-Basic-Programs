package task1;
import java.util.*;
public class SumOfFactors{
   public static int factsum(int x)
	  {
		  int d=0,i;
		  System.out.println("Factors are: ");
		  for(i=2;i<=x;i++)
		  {
			  if(x%i==0)
			  {
				  System.out.println(i);
				  d=d+i;
			  }
		  }
		  return d;
	   }
	public static void main(String[] args) 
	{
    int x;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number: ");
    x=sc.nextInt();
    System.out.println("sum of factors is: "+factsum(x));
	}
}

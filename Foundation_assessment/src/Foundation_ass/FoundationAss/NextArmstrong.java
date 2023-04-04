package Foundation_ass.FoundationAss;
import java.util.*;
import java.lang.Math;

public class NextArmstrong {

	public static boolean isArmstrong(int n) {
		int temp, digits = 0, last = 0, sum = 0;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (n == sum)
			return true;
		else
			return false;
	}

	   public static void main(String[] args)
	    {
	    int number;
	    System.out.println("Enter a num:");
	    Scanner sc=new Scanner(System.in);
	    number=sc.nextInt();
	    int increment = number + 1;
	    while (isArmstrong(increment) == false)
	        increment++;
	     System.out.println("Next nearest armstrong num is: "+increment);
	    }
	}

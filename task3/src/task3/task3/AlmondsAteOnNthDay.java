package task3.task3;
import java.util.*;
public class AlmondsAteOnNthDay {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Number of days: ");
	        int days = sc.nextInt();
	        int almonds[] = almondsForNDays(days);
	        int sum = 0;
	        for (int i = 0; i < days; i++)
	            sum = sum + almonds[i];
	        System.out.println("Almonds for " + days + " days are " + sum);
	    }
	    public static int[] almondsForNDays(int days) {
	        int almonds[] = new int[days];
	        almonds[0] = 2;
	        almonds[1] = 3;
	        almonds[2] = 5;
	        for (int i = 3; i < days; i++)
	            almonds[i] = almonds[i - 1] + almonds[i - 2] + almonds[i - 3];
	        return almonds;
	    }
	}
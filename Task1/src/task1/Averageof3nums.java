package task1;
import java.util.*;
public class Averageof3nums 
{

	public static void main(String[] args) 
	{
    int x,y,z;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 3 nums: ");
    x=sc.nextInt();
    y=sc.nextInt();
  	z=sc.nextInt();
    System.out.println("average is: "+avg(x,y,z));
	}
	public static int avg(int x,int y,int z)
	{
		return ((x+y+z)/3);
		
	}
}

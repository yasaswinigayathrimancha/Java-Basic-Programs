package Foundation_ass.FoundationAss;
import java.util.*;
public class PerfectNumOrNot {

			static long sum=0;	
			long perfectOrNot(long num,int i)
			{
			 if(i<=num/2)
			  {
			       if(num%i==0)
			       {
				sum+=i;
			       }
			     i++;
			     perfectOrNot(num,i);
		  	  }
			 return sum;	
			}
			public static void main(String arg[])	
			{
			    long n,res;
			    int i=1;
		        Scanner sc=new Scanner(System.in);	   	 
			    System.out.println("Enter a number");
		       n=sc.nextLong();
			    PerfectNumOrNot p=new PerfectNumOrNot( );
			    res=p.perfectOrNot(n,i);
			    if(res==n)
			       System.out.println(n+" is a perfect number");
			    else
			       System.out.println(n+" is not a  perfect number"); 
			 } 
		}
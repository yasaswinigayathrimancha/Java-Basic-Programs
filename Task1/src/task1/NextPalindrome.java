
package task1;
import java.util.*;
public class NextPalindrome
{
public static boolean PalindromeTest(String s)
{
    int l = 0;
    int r= s.length() - 1;
    while (l<r)
    {
        if (s.charAt(l) !=s.charAt(r))
            return false;
        l++;
        r--;
    }
    return true;  
}
public static void NearestPalindrome(int num)
{
    int k = num + 1;
    while (PalindromeTest(Integer.toString(k)) == false)
        k++;
     System.out.println("Next nearest palindrome is: "+k);
}
   public static void main(String[] args)
    {
    int n;
    System.out.println("Enter a num:");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    NearestPalindrome(n);
    }
}
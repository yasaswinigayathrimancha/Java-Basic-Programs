package task2.task2;
import java.util.*;
public class OddPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        System.out.println(isPalindromeOdd(num));
    }
    public static boolean isPalindromeOdd(int num) {
        int rev = 0, digit, temp;
        temp = num;
        while (num > 0) {
            digit = num % 10;
            if (digit % 2 == 0)
                return false;
            else {
                rev = (rev * 10) + digit;
                num = num / 10;
            }
        }
        if (temp == rev)
            return true;
        return false;
    }
}


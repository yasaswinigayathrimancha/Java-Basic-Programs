package task2.task2;
import java.util.*;
public class Sumofdigitsofnum {
	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n;
		System.out.println("enter a number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(sumOfDigits(n));
	}
}

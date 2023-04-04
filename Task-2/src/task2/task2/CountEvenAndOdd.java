package task2.task2;
import java.util.*;
public class CountEvenAndOdd {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		System.out.println("even count:" + even_count(n));
		System.out.println("odd count:" + odd_count(n));
	}

	public static int even_count(int n) {
		int even_count = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0)
				even_count++;
			n = n / 10;
		}
		return even_count;
	}

	public static int odd_count(int n) {
		int odd_count = 0;
		while (n > 0) {
			int k = n % 10;
			if (k % 2 != 0)
				odd_count++;
			n = n / 10;
		}
		return odd_count;
	}
}

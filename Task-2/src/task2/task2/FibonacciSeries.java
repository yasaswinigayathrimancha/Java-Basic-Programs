package task2.task2;
import java.util.*;
public class FibonacciSeries {
	public static int series(int n) {
		if (n <= 1)
			return n;
		return series(n - 1) + series(n - 2);
	}

	public static void main(String args[]) {
		int N;
		System.out.println("Enter How many terms: ");
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.print(series(i) + " ");
		}
	}
}
package task3.task3;
import java.util.Scanner;
public class NumPattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int rows = sc.nextInt();
		patternFunc(rows);
	}
	public static void patternFunc(int rows) {
		System.out.println("Pattern is: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print("1 ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		sc.close();
	}
}
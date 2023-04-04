package task3.task3;
import java.util.*;
public class ArmstrongListInGivenRange {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter range: ");
		int from = obj.nextInt();
		int upto = obj.nextInt();
		calculateArmstrong(from, upto);
	}

	public static void calculateArmstrong(int from, int upto) {
		System.out.println("Armstrong numbers are:");
		for (int i = from; i <= upto; i++) {
			int duplicate = i;
			int num = duplicate;
			int sum = 0, r = 0, count = 0;
			while (duplicate != 0) {
				duplicate = duplicate / 10;
				count++;
			}
			duplicate = num;
			
			while (duplicate != 0) {
				r = duplicate % 10;
				double power = Math.pow(r, count);
				sum = sum + (int) power;
				duplicate = duplicate / 10;
			}
			if (sum == num) {
				System.out.print(sum + " ");
			}
		}

	}

}
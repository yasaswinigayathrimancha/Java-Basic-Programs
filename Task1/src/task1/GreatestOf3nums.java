package task1;

import java.util.Scanner;

public class GreatestOf3nums {

	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 nums: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		System.out.println("Greatest among three nums is: " + greatest(x, y, z));
	}

	public static int greatest(int x, int y, int z) {
		if (x>=y &&  x>=z) {
			return x;
		} else if (y>=x && y>=z) {
			return y;
		} else
			return z;
	}

}

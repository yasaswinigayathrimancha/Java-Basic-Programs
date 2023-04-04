package task3.task3;

import java.lang.Math;
import java.util.*;

public class PerfectEvenAnd4DigitedNums {
	public static void printBlock(int duplicateSquare) {
		System.out.println(duplicateSquare);
	}

	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 digit range: ");
		int from = sc.nextInt();
		int upto = sc.nextInt();
		System.out.println("Numbers are: ");
		double start1 = Math.sqrt(from);
		int start = (int) start1 + 1;
		double end1 = Math.sqrt(upto);
		int end = (int) end1 - 1;
		int diff = end - start;
		for (num = start; num <= end; num++) {
			int square = num * num;
			if (square % num == 0 && square / num == num) {
				evenDigitsTest(square);
			}
		}

	}

	public static boolean evenDigitsTest(int square) {
		int digit, count = 0;
		int duplicateSquare = square;
		while (square > 0) {
			digit = square % 10;
			if (digit % 2 == 0 && digit != 0) {
				count++;
			}
			square = square / 10;
		}
		if (count == 4) {
			printBlock(duplicateSquare);
			return true;
		} else
			return false;
	}

}
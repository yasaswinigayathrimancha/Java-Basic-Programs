package task4.task4;

import java.util.*;

public class SumOfStringElementsWithFibRef {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String in Capital letters:");
		String str = sc.nextLine();
		int len = str.length();
		System.out.println("Fibonacci Sum For Given String is : " + fibSumForGivenString(str));
	}

	public static char[] charArray() {
		char[] ch = new char[26];
		int j = 0;
		char letter;
		for (letter= 'A' ; letter<= 'Z' ; letter++, j++) {
			ch[j] = letter;
		}
		return ch;
	}

	public static int[] fibArray() {
		int fib[] = new int[26];
		fib[0] = 0;
		fib[1] = 1;
		fib[2] = fib[0] + fib[1];
		for (int i = 3; i <= 25; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib;
	}

	public static int fibSumForGivenString(String str) {
		char[] charArr = charArray();
		int count = 0;
		int fibonacci[] = fibArray();
		for (int k = 0; k <= 25; k++) {
			for (int l = 0; l< str.length(); l++) {
				if (str.charAt(l) == charArr[k]) {
					count = count + fibonacci[k];
				}
			}
		}
		return count;
	}
}

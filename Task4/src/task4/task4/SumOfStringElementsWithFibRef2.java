package task4.task4;
import java.util.*;

public class SumOfStringElementsWithFibRef2 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter a string:");
	        String word = sc.nextLine();
	        System.out.println( word + " is " + alphabetSeries(word));
	    }
	    public static int alphabetSeries(String word) {
	        int array[] = new int[26];
	        array[0] = 0;
	        array[1] = 1;
	            array[i] = array[i - 1] + array[i - 2];
	        int sum = 0;
	        for (int i = 0; i < word.length(); i++)
	            sum = sum + array[word.charAt(i) - 'A'];
	        return sum;
	    }
	}
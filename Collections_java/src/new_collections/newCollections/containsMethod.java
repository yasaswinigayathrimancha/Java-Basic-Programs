package new_collections.newCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class containsMethod {
	public static void main(String args[]) {

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int element;
		Scanner b = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = b.nextInt();
		System.out.println("enter elements: ");
		for (int i = 0; i < n; i++) {
			element = b.nextInt();
			arrList.add(element);
		}
		duplicate(arrList);
	}

	public static void duplicate(ArrayList<Integer> arrList) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		ArrayList<Integer> arrList2 = new ArrayList<Integer>();
		for (Integer i : arrList) {
			if (hashSet.contains(i))
				arrList2.add(i);
			else
				hashSet.add(i);
		}

		System.out.println("original elements are:" + hashSet);
	}
}
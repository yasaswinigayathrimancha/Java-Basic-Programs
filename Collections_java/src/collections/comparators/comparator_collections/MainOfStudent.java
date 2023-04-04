package collections.comparators.comparator_collections;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Arrays;

public class MainOfStudent {

	public static void main(String args[]) {

		ArrayList<Student> arrList = new ArrayList<Student>();

		Student s1 = new Student("Maya", 98, 97, 93);
		arrList.add(s1);
		Student s2 = new Student("Anshu", 89, 67, 45);
		arrList.add(s2);
		Student s3 = new Student("Sonakshi", 87, 65, 33);
		arrList.add(s3);
		Student s4 = new Student("Agni", 88, 55, 28);
		arrList.add(s4);

		System.out.println("Unsorted:");
		System.out.println("-----------------");

		for (int i = 0; i < arrList.size(); i++)
			System.out.println(arrList.get(i));

		Collections.sort(arrList, new SortByRoll());

		System.out.println("\nSorted by rollno:");
		System.out.println("-----------------");

		for (int i = 0; i < arrList.size(); i++)
			System.out.println(arrList.get(i));

		Collections.sort(arrList, new SortByName());

		System.out.println("\nSorted by name:");
		System.out.println("-----------------");

		for (int i = 0; i < arrList.size(); i++)
			System.out.println(arrList.get(i));
		  
		
		System.out.println("\nAfter calculating percentages, ranks are: ");
		System.out.println("-----------------------------------------");


        int count = 0;
        for(Student i : arrList) 
            i.setRank(++count);
        for(Student i : arrList) 
            System.out.println(i);

	}
}

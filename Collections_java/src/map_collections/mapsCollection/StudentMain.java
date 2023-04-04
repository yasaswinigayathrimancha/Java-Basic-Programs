package map_collections.mapsCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class StudentMain {
	public static void main(String[] args) {

		Student std1 = new Student(1, 93, 99, 89, "Sneha");
		Student std2 = new Student(2, 93, 99, 99, "Manoj");
		Student std3 = new Student(3, 90, 94, 69, "Harish");
		Student std4 = new Student(4, 95, 91, 69, "Shiva");
		Student std5 = new Student(5, 90, 94, 89, "Shyama");
		
		ArrayList<Student> studentArrayList = new ArrayList<Student>();
		
		HashMap<Integer, Student> hashMap = new HashMap<Integer, Student>();
		
		studentArrayList.add(std1);
		studentArrayList.add(std2);
		studentArrayList.add(std3);
		studentArrayList.add(std4);
		studentArrayList.add(std5);
		
		System.out.println("In studentArrayList: ");

		for (Student student : studentArrayList) {
			System.out.println(student);
		}
		for (Student student : studentArrayList) {
			hashMap.put(student.getStudentId(), student);
		}
		System.out.println("In hashMap: ");

		for (Entry<Integer, Student> entry : hashMap.entrySet()) {
			System.out.println("Key : "+entry.getKey() + " &  Value: " + entry.getValue());
		}
		

	}
}
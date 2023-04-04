package collections.comparators.comparator_collections;

import java.io.*;
import java.lang.*;
import java.util.*;

public class EmployeeMain {

	public static void main(String args[]) {

		ArrayList<Employee> ar = new ArrayList<Employee>();
		Scanner obj=new Scanner(System.in);

		Employee s1 = new Employee(11000, "Maya");
		ar.add(s1);
		Employee s2 = new Employee(15000, "Anshu");
		ar.add(s2);
		Employee s3 = new Employee(12100, "Sonakshi");
		ar.add(s3);
		Employee s4 = new Employee(10989, "Agni");
		ar.add(s4);

		
		 int sortMethod = obj.nextInt();
	        if(sortMethod == 1) {
	            Collections.sort(ar, new SortByEmpName());
	        }
	        if(sortMethod == 2) {
	            Collections.sort(ar, new SortByEmpSalary());
	        }
	        obj.close();
	        for(Employee e: ar) {
	            System.out.println(e);
	        }
	}
}

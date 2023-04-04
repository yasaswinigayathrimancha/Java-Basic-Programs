package Foundation_ass.FoundationAss;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class organisation {
	public static void main(String[] args) {

		Employee std1 = new Employee("Sneha",900000);
		Employee std2 = new Employee("Manoj",500000);
		Employee std3 = new Employee("Harish",700000);
		Employee std4 = new Employee("Shiva",400000);
		Employee std5 = new Employee( "Shyama",300000);
		
		ArrayList<Employee> empArrList = new ArrayList<Employee>();
		
		HashMap<Integer, Employee> hashMap = new HashMap<Integer, Employee>();
		
		empArrList.add(std1);
		empArrList.add(std2);
		empArrList.add(std3);
		empArrList.add(std4);
		empArrList.add(std5);
		
		System.out.println("In emp Arr List: ");

		for (Employee employee : empArrList) {
			System.out.println(employee);
		}
		for (Employee employee : empArrList) {
			hashMap.put(employee.getEmployeeId(), employee);
		}
		System.out.println("In hashMap: ");

		for (Entry<Integer, Employee> entry : hashMap.entrySet()) {
			System.out.println("Key : "+entry.getKey() + " &  Value: " + entry.getValue());
		}
		

	}
}
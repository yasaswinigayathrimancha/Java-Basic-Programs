package collections.comparators.comparator_collections;

import java.io.*;
import java.lang.*;
import java.util.*;

public class SortByEmpName implements Comparator<Employee> {

	public int compare(Employee ee1, Employee ee2) {

		return ee1.name.compareTo(ee2.name);
	}
}


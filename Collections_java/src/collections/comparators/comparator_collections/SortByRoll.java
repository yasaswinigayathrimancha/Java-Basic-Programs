package collections.comparators.comparator_collections;
import java.io.*;
import java.lang.*;
import java.util.*;

public class SortByRoll implements Comparator<Student> {

	public int compare(Student a, Student b) {

		return a.rollno - b.rollno;
	}
}

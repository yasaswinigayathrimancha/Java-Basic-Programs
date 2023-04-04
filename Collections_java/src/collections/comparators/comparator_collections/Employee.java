package collections.comparators.comparator_collections;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Employee {

	int salary;
	String name;
	int id;
	
	private static int idGen = 1001;
    public Employee() {
        super();
        this.id = ++idGen;
    }

	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
		this.id = ++idGen;
	}
	


	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String toString() {

		return this.salary + " " + this.name + " " + this.id ;
	}
}

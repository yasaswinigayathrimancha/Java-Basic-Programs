package collections.comparators.comparator_collections;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Student {

	int rollno;
	String name;
	int sub1,sub2,sub3;
	int rank;
	double percent;

	private static int idGen = 1001;
	
    public Student() {
        super();
        this.rollno = ++idGen;
    }
    
	public Student(String name, int sub1, int sub2, int sub3) {
		super();
		this.rollno = ++idGen;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	

    public  int getRank() {
        return rank;
    }
    public  void setRank(int rank) {
        this.rank = rank;
    }

	
	public double calPercent() {
		percent= (sub1+sub2+sub3)*0.3;
		return percent;	
	}
	

	public String toString() {

		return this.rollno + " " + this.name + " " +this.rank;
	}
}

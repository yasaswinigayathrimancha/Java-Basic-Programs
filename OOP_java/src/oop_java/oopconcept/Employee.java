package oop_java.oopconcept;

public class Employee {
	    private int empId;
	    private String name;
	    private int salary;
	    private static int idGen = 1000;
	    public Employee(String name, int salary) {
	        super();
	        this.name = name;
	        this.salary = salary;
	        this.empId = ++idGen;
	    }
	    public Employee() {
	        super();
	        this.empId = ++idGen;
	    }
	    public int getEmpId() {
	        return empId;
	    }
	    public int getSalary() {
	        return salary;
	    }
	    public void setSalary(int salary) {
	        this.salary = salary;
	    }
	    double calTax(int salary) {
	        double tax;
	        if (salary < 30000) {
	            tax = (salary*0.1);
	        } 
	        else if (salary >= 30000 && salary < 50000) {
	            tax = (salary*0.2);
	        } else {
	            tax = (salary*0.3);
	        }
	        return tax;
	    }
	    @Override
	    public String toString() {
	        return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", tax = " + calTax(salary) + "]";
	    }
	}


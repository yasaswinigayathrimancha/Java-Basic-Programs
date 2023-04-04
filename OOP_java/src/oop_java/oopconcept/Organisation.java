package oop_java.oopconcept;

public class Organisation {
	    public static void main(String[] args) {
	        Employee emp1 = new Employee("Asif", 20000);
	        Employee emp2 = new Employee("Akhil", 50000);
	        Employee emp3 = new Employee("Aakanksha", 150000);
	        Employee[] emply = { emp1, emp2, emp3 };
	        Employee highestPaid = emply[0];
	        for (Employee emp : emply) {
	            if (emp.getSalary() > highestPaid.getSalary()) {
	                highestPaid = emp;
	            }
	        }
	        System.out.println("Highest salaried Employee details with tax details also :" + highestPaid);
	    }
}
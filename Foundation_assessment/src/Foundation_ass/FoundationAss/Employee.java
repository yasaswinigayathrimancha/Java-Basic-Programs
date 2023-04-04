package Foundation_ass.FoundationAss;
public class Employee {
    private int employeeId;
    private String name;
    private int salary;
    private static int idGen = 1000;
    public Employee(String name, int salary) {
        super();
        this.employeeId = ++idGen;
        this.name = name;
        this.salary = salary;
    }
    public Employee() {
        super();
        this.employeeId = ++idGen;
    }
    double calTax(int salary) {
        double tax;
        if (salary <= 500000) {
            tax = (10 * salary) / 100.0;
        } 
        else {
            tax = (20 * salary) / 100.0;
        }         return tax;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
    }
}
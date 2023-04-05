package oop_java.interfaceDemo;

public class SBI implements BankInterface{
	
	private Customer customer;
	private double interestRate=3.5;
	
	public SBI(Customer customer) {
		super();
		this.customer = customer;
	}

	public SBI() {
		super();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getInterestRate() {
		return interestRate;
	}
	

	public void deposit(int amount) {
		customer.setBalance(customer.getBalance() + amount);
	}
	public double calInterest(double interestForYears) {
		return (customer.getBalance() * interestRate *interestForYears)/100.0 ;

	}

	@Override
	public void withDraw(int amount) {
		
	}
}
	
	
	
package oop_java.interfaceDemo;
public class ICICI implements BankInterface{
	
	private Customer customer;
	private double interestRate=3.5;
	private int withdrawalCharges=25;
	
	public ICICI(Customer customer) {
		super();
		this.customer = customer;
	}
	
	
	public ICICI() {
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
	public int getWithdrawalCharges() {
		return withdrawalCharges;
	}
	
	
	public void deposit(int amount) {
		customer.setBalance(customer.getBalance + amount);
	}
	public double calInterest(double interestForYears) {
		return (customer.getBalance * interestRate *interestForYears)/100.0 ;

	}
	public void withDraw(int amount) {
		return customer.setBalance(customer.getBalance - amount);

	}
}
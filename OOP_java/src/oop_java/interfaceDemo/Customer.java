package oop_java.interfaceDemo;

public class Customer {

	private String name;
	private int id;
	private int balance;
	
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

	

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Customer(String name, int id, int balance) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	

}

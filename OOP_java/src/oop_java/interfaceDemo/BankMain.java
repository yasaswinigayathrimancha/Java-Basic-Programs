package oop_java.interfaceDemo;

public class BankMain{
	public static void main(String args[]) {
		
		Customer cust1=new Customer("Kanksha",6001,100000);
		
		SBI acc1=new SBI(cust1);
		ICICI acc2=new ICICI(cust1);
		
		System.out.println("Interest at SBI is:"+acc1.calInterest(3));
		System.out.println("Interest at ICICI is:"+acc2.calInterest(7));

	}
	
}
package abstraction.bank;

//We can introduce an abstract class called Account that represents a bank account, but doesn't specify the implementation details:

public abstract class Account {
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();
}
/*  This abstract class defines three abstract methods: deposit(), withdraw(), and getBalance(). 
  These methods don't have any implementation details and are left to be defined by the subclasses of the Account class.
   By defining an abstract class with these methods, we have abstracted away the details of the bank account and exposed only the interface to the users.


We can then create concrete subclasses of the Account class, such as SavingsAccount and CheckingAccount */
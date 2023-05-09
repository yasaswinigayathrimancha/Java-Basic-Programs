package abstraction.bank;
/*We can then create concrete subclasses of the Account class, such as SavingsAccount and CheckingAccount */


public class CheckingAccount extends Account {
    private double balance;
    private double overdraftLimit;

    public CheckingAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount < -overdraftLimit) {
            throw new RuntimeException("Insufficient funds");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}




/* These subclasses provide their own implementation of the abstract methods defined in the Account class. 
The SavingsAccount class simply updates the balance when a deposit or withdrawal is made, 
 while the CheckingAccount class checks if the withdrawal amount exceeds the overdraft limit before updating the balance.
Now, we can create and use SavingsAccount and CheckingAccount objects without worrying about the internal details of the bank account.
We can simply call the methods defined in the Account class and let the subclasses handle the details. 
This is an example of how abstraction can simplify the usage of complex systems by hiding the implementation details and exposing a simplified interface to the users. */
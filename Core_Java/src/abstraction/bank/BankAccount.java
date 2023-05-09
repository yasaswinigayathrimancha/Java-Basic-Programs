/*
 Let's say we have a class called BankAccount 
 that represents a bank account with a balance and allows deposits and withdrawals.
  Here's an example implementation:
 
 */

package abstraction.bank;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

/*
 This implementation is straightforward and allows us to create and manipulate bank accounts.
  However, it exposes the internal details of the bank account, 
  such as the balance, to the users of the class.
   In some cases, we might want to hide these details and only expose a simplified interface to the users. This is where abstraction comes in.
 */

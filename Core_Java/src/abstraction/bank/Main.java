package abstraction.bank;

public class Main {
    public static void main(String[] args) {
        // create a savings account with an initial balance of 1000
        SavingsAccount savingsAccount = new SavingsAccount(1000);

        // deposit 500 into the savings account
        savingsAccount.deposit(500);

        // withdraw 200 from the savings account
        savingsAccount.withdraw(200);

        // print the balance of the savings account
        System.out.println("Savings account balance: " + savingsAccount.getBalance());

        // create a checking account with an initial balance of 1000 and an overdraft limit of 500
        CheckingAccount checkingAccount = new CheckingAccount(1000, 500);

        // deposit 500 into the checking account
        checkingAccount.deposit(500);

        // withdraw 1200 from the checking account (exceeds the overdraft limit)
        try {
            checkingAccount.withdraw(1200);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // print the balance of the checking account
        System.out.println("Checking account balance: " + checkingAccount.getBalance());
    }
}

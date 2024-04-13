class Account {
    private double balance;

    public Account() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    public void computeInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest computed and added. New balance: " + getBalance());
    }
}

class CurrentAccount extends Account {
    // CurrentAccount class does not need any specific implementation
}

public class Bank {
    public static void main(String[] args) {
        // Create a savings account with an interest rate of 6%
        SavingsAccount savingsAccount = new SavingsAccount(0.06);
        // Create a current account
        CurrentAccount currentAccount = new CurrentAccount();

        // Accept deposit
        savingsAccount.deposit(5000);
        currentAccount.deposit(3000);

        // Permit withdrawal
        savingsAccount.withdraw(1000);
        currentAccount.withdraw(500);

        // Compute interest for savings account
        savingsAccount.computeInterest();

        // Display balances
        System.out.println("Savings Account Balance:");
        savingsAccount.displayBalance();
        System.out.println("Current Account Balance:");
        currentAccount.displayBalance();
    }
}

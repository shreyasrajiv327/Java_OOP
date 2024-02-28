import java.util.Scanner;
import java.text.DecimalFormat;

class Account {
    private int accountNumber;
    private double balance;

    // Constructor
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " successfully. New balance: " + formatBalance());
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " successfully. New balance: " + formatBalance());
        }
    }

    // Method to format balance with two decimal places
    private String formatBalance() {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(balance);
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    private double interestRate;

   
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
        interestRate = 0.06; 
    }

  
    public double computeInterest() {
        return getBalance() * interestRate;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create savings account
        System.out.println("Enter savings account number:");
        int savingsAccountNumber = scanner.nextInt();
        System.out.println("Enter initial savings account balance:");
        double savingsInitialBalance = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber, savingsInitialBalance);

        // Deposit to savings account
        System.out.println("Enter amount to deposit into savings account:");
        double savingsDepositAmount = scanner.nextDouble();
        savingsAccount.deposit(savingsDepositAmount);

        // Withdraw from savings account
        System.out.println("Enter amount to withdraw from savings account:");
        double savingsWithdrawAmount = scanner.nextDouble();
        savingsAccount.withdraw(savingsWithdrawAmount);

        // Compute interest for savings account
        double interest = savingsAccount.computeInterest();
        System.out.println("Interest earned on savings account: " + interest);

        // Create current account
        System.out.println("Enter current account number:");
        int currentAccountNumber = scanner.nextInt();
        System.out.println("Enter initial current account balance:");
        double currentInitialBalance = scanner.nextDouble();
        Account currentAccount = new Account(currentAccountNumber, currentInitialBalance);

        // Deposit to current account
        System.out.println("Enter amount to deposit into current account:");
        double currentDepositAmount = scanner.nextDouble();
        currentAccount.deposit(currentDepositAmount);

        // Withdraw from current account
        System.out.println("Enter amount to withdraw from current account:");
        double currentWithdrawAmount = scanner.nextDouble();
        currentAccount.withdraw(currentWithdrawAmount);

        scanner.close();
    }
}

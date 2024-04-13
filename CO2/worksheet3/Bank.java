import java.util.Scanner;
import java.text.DecimalFormat;
class ParentAccount{
    private int AccountNumber;
    private double balance;

    ParentAccount(int AccountNumber,double balance){
        this.AccountNumber =  AccountNumber;
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
        System.out.println("New Balance:" + balance);
    }

    public void withDraw(double drawAmount)
    {
        if(balance>=drawAmount)
        {
            balance -= drawAmount;
            System.out.println("New Balance after withdrawal:" + balance);
        }
        else{
            System.out.println("Suffiecient funds not available");
        }
        }
    public double getBalance()
    {
        return balance;
    }

    }

    class Savings extends ParentAccount{
        private double interest;
        public Savings(int AccountNumber,double balance){
            super(AccountNumber,balance);
            this.interest = 0.06;
        }
        public double getInterestAmount(){
            double a=getBalance() + getBalance()*interest;
             return a;
        }
    }

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter savings account number:");
        int savingsAccountNumber = sc.nextInt();
        System.out.println("Enter initial savings account balance:");
        double savingsInitialBalance = sc.nextDouble();

        ParentAccount PA = new ParentAccount(savingsAccountNumber, savingsInitialBalance);
        // double b =PA.getBalance();
        // System.out.println("Current Balance : " + b);

        PA.deposit(1000);
        double b =PA.getBalance();
        System.out.println("Current Balance : " + b);
        Savings SA = new Savings(savingsAccountNumber, b);
        double it = SA.getInterestAmount();
        System.out.println("Current Balance with Interest : " + it);
    }
}

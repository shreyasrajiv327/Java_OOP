package Extras;
import java.util.Scanner;
public class IncomeTaxCalculator {
   public static void main(String[] args) {
       // Declare constants
       final double TAX_RATE_ABOVE_20K = 0.1;
       final double TAX_RATE_ABOVE_40K = 0.2;
       final double TAX_RATE_ABOVE_60K = 0.3;
       final double REBATE_RATE = 0.1;
       final double REBATE_CAP = 1000;
       int taxableIncome;
       double taxPayable, rebate;
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the taxable income: $");
       taxableIncome = in.nextInt();
       in.close();
       if (taxableIncome <= 20000) {
           taxPayable = 0;
       } else if (taxableIncome <= 40000) {
           taxPayable = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
       } else if (taxableIncome <= 60000) {
           taxPayable = 20000 * TAX_RATE_ABOVE_20K + (taxableIncome - 40000) * TAX_RATE_ABOVE_40K;
       } else {
           taxPayable = 20000 * TAX_RATE_ABOVE_20K + 20000 * TAX_RATE_ABOVE_40K + (taxableIncome - 60000) * TAX_RATE_ABOVE_60K;
       }
       rebate = Math.min(taxPayable * REBATE_RATE, REBATE_CAP);
       System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
       System.out.printf("The rebate is: $%.2f%n", rebate);
       System.out.printf("The net income tax payable is: $%.2f%n", taxPayable - rebate);
   }
}
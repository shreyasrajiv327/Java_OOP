class Bankk
{
    final int FIXED_LOAN_AMOUNT = 1500000;
    public void displayLoanSchemes(int age)
    {
        if (age <= 25)
        {
            System.out.println("Eligible for Education Loan of Rs. 10,00,000");
        }
        else if (age <= 45)
        {
            System.out.println("Eligible for Fixed Loan Amount of Rs. " + FIXED_LOAN_AMOUNT);
        }
        else if (age <= 60)
        {
            System.out.println("Eligible for House Loan of Rs. 20,00,000");
        }
        else
        {
            System.out.println("No loan schemes available for age above 60.");
        }
    }

    public static void main(String[] args)
    {
        Bankk bank = new Bankk();
        int age1 = 20;
        int age2 = 35;
        int age3 = 50;
        int age4 = 65;
        System.out.println("Loan Schemes for age 20:");
        bank.displayLoanSchemes(age1);
        System.out.println("\nLoan Schemes for age 35:");
        bank.displayLoanSchemes(age2);
        System.out.println("\nLoan Schemes for age 50:");
        bank.displayLoanSchemes(age3);
        System.out.println("\nLoan Schemes for age 65:");
        bank.displayLoanSchemes(age4);
    }
}
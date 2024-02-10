import java.util.Scanner;

public class RetailStore {
   double billAmount;
   public RetailStore(double billAmount)
   {
        this.billAmount=billAmount;
   }
    public double calculateDiscount(double billAmount)
    {
        double discountPercentage;
        if (billAmount>=1000)
        {
            discountPercentage = 10;
        }
        else if(billAmount>=500 && billAmount<1000) {
            discountPercentage = 5;
        }
        else if(billAmount>0 && billAmount<500) {
            discountPercentage = 1;
        }
        else{
            discountPercentage = 0;
        }

        return discountPercentage;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the bill amount: ");
        double billAmount = scanner.nextDouble();

        RetailStore retailStore = new RetailStore(billAmount);

      
        double discountPercentage = retailStore.calculateDiscount(billAmount);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        double discountedBill = billAmount-((discountPercentage/100)*billAmount);
        System.out.println("Discount Price: " + discountedBill + "%");
        scanner.close();
    }
}

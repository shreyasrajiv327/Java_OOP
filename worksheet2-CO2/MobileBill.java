import java.util.Scanner;

public class MobileBill {
    double localCallRate;
    double isdCallRate;
    double netPackageCost;

    public MobileBill() {
        localCallRate = 0.10;
        isdCallRate = 1.00;
        netPackageCost = 500;
    }

   
    public MobileBill(double localCallRate, double isdCallRate, double netPackageCost) {
        this.localCallRate = localCallRate;
        this.isdCallRate = isdCallRate;
        this.netPackageCost = netPackageCost;
    }

    public double calculateBill(int localCalls, int isdCalls) {
        double localBill = localCalls * localCallRate;
        double isdBill = isdCalls * isdCallRate;
        return localBill + isdBill + netPackageCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MobileBill customer1 = new MobileBill(); 
        System.out.print("Enter the number of local calls for Customer 1: ");
        int localCalls1 = scanner.nextInt();
        System.out.print("Enter the number of ISD calls for Customer 1: ");
        int isdCalls1 = scanner.nextInt();
        System.out.println("Total Bill Amount for Customer 1: Rs " + customer1.calculateBill(localCalls1, isdCalls1));

        MobileBill customer2 = new MobileBill(0.15, 1.50, 600); 
        System.out.print("Enter the number of local calls for Customer 2: ");
        int localCalls2 = scanner.nextInt();
        System.out.print("Enter the number of ISD calls for Customer 2: ");
        int isdCalls2 = scanner.nextInt();
        System.out.println("Total Bill Amount for Customer 2: Rs " + customer2.calculateBill(localCalls2, isdCalls2));

        scanner.close();
    }
}

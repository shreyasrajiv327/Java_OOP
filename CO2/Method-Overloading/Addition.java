import java.util.Scanner;

public class Addition {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Addition adder = new Addition();

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        System.out.println("Sum of two integers: " + adder.add(num1, num2));
        System.out.print("Enter an integer: ");
        int intNum = scanner.nextInt();
        System.out.print("Enter a float: ");
        float floatNum = scanner.nextFloat();
        System.out.println("Sum of an integer and a float: " + adder.add(intNum, floatNum));

        System.out.print("Enter first integer: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num4 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int num5 = scanner.nextInt();
        System.out.println("Sum of three integers: " + adder.add(num3, num4, num5));
    }

    public int add(int a, int b) {
        return a + b;
    }


    public float add(int a, float b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

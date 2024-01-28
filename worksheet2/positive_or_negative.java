package worksheet2;
import java.util.Scanner;

public class positive_or_negative {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the user's input as a double
        double number = scanner.nextDouble();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Check if the number is positive or negative and print the result
        if (number > 0) {
            System.out.println("The entered number is positive.");
        } else if (number < 0) {
            System.out.println("The entered number is negative.");
        } else {
            System.out.println("The entered number is zero.");
        }
    }
}

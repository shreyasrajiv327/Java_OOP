import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the box: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();

        double volume = calculateVolume(length, width, height);

        System.out.println("Volume of the box: " + volume);

        scanner.close();
    }

    // Method to calculate the volume of a box
    public static double calculateVolume(double length, double width, double height) {
        double volume = length * width * height;
        return volume;
    }
}

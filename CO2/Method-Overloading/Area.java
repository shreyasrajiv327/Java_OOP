import java.util.Scanner;

public class Area {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Area areaCalculator = new Area();

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        System.out.println("Area of the rectangle: " + areaCalculator.calculateArea(length, breadth));

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
        System.out.println("Area of the square: " + areaCalculator.calculateArea(side));

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of the circle: " + areaCalculator.calculateAreaOfCircle(radius));
    }

    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateAreaOfCircle(double radius) {
        double pi = Math.PI;
        return pi * radius * radius;
    }
}

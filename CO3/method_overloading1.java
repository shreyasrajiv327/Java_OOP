import java.util.Scanner;

class AreaCalculator {
   
    static double calculateArea(double length, double width) {
        return length * width;
    }

    static int calculateArea(int side) {
        return side * side;
    }
    
    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class method_overloading1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        double rectangleArea = AreaCalculator.calculateArea(length, width);
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Square
        System.out.print("Enter side length of square(Integer): ");
        int side = scanner.nextInt();
        int squareArea = AreaCalculator.calculateArea(side);
        System.out.println("Area of Square: " + squareArea);

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        double circleArea = AreaCalculator.calculateArea(radius);
        System.out.println("Area of Circle: " + circleArea);

        // Close the scanner
        scanner.close();
    }
}
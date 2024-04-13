import java.util.Scanner;

abstract class Shape {
    abstract void area();
    void input() {
        // Method to get inputs for area calculation
        Scanner scanner = new Scanner(System.in);
        // Input logic for different shapes
        scanner.close(); // Close the Scanner object when done
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    @Override
    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        width = scanner.nextDouble();
      
    }
}

class Triangle extends Shape {
    double base;
    double height;

    @Override
    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }

    @Override
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        base = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        height = scanner.nextDouble();
        // Close the Scanner object when done
    }
}

class Square extends Shape {
    double side;

    @Override
    void area() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        side = scanner.nextDouble();
        scanner.close(); // Close the Scanner object when done
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.input();
        rectangle.area();

        Triangle triangle = new Triangle();
        triangle.input();
        triangle.area();

        Square square = new Square();
        square.input();
        square.area();
    }
}

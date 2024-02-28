package CO3.Abstract;
// Abstract class Shape
abstract class Shape {
    // Abstract methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract methods for Circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    // Constructor
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Implementing abstract methods for Triangle
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

public class q3 {
    public static void main(String[] args) {
        // Creating objects for Circle and Triangle
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4, 5);

        // Calculating and printing area and perimeter for Circle
        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());

        // Calculating and printing area and perimeter for Triangle
        System.out.println("Triangle - Area: " + triangle.calculateArea() + ", Perimeter: " + triangle.calculatePerimeter());
    }
}




/**
 * string depth,depth,
 */


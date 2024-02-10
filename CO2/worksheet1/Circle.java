import java.util.Scanner;

public class Circle {
    double radius;

  
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        double perimeter = circle.calculatePerimeter();
        System.out.println("Perimeter of the circle: " + perimeter);

        scanner.close();
    }
}

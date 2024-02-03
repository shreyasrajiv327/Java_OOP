import java.util.Scanner;

public class Box {
    double length;
    double width;
    double breadth;


    public Box() {
        length = 0.0;
        width = 0.0;
        breadth = 0.0;
    }

    public Box(double length, double width, double breadth) {
        this.length = length;
        this.width = width;
        this.breadth = breadth;
    }


    public double calculateVolume() {
        return length * width * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box box1 = new Box(); 
        System.out.print("Enter length of Box 1: ");
        box1.length = scanner.nextDouble();
        System.out.print("Enter width of Box 1: ");
        box1.width = scanner.nextDouble();
        System.out.print("Enter breadth of Box 1: ");
        box1.breadth = scanner.nextDouble();
        System.out.println("Volume of Box 1: " + box1.calculateVolume());

        Box box2 = new Box(); 
        System.out.print("Enter length of Box 2: ");
        box2.length = scanner.nextDouble();
        System.out.print("Enter width of Box 2: ");
        box2.width = scanner.nextDouble();
        System.out.print("Enter breadth of Box 2: ");
        box2.breadth = scanner.nextDouble();
        System.out.println("Volume of Box 2: " + box2.calculateVolume());

        scanner.close();
    }
}

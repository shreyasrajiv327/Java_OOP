import java.util.Scanner;

public class rectangle_perimeter {
    public static void main(String[] args) {
        System.out.println("Enter Lenght and Breadth");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int Length = sc1.nextInt();
        int Breadth =sc2.nextInt();
        int Area = 2*(Length+Breadth);
        sc1.close();
        sc2.close();
        System.out.println(Area);
    }
}

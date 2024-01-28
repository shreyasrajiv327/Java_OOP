

import java.util.Scanner;
public class Arithmetic_operations {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner a1 = new Scanner(System.in);
        Scanner a2 = new Scanner(System.in);
        int s1 = a1.nextInt();
        int s2 = a2.nextInt();
        System.out.println("Enter choices");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        input.close();
        a1.close();
        a2.close();
        switch (a) {
            case 1:
                int sum = s1 + s2;
                System.out.println(sum);
                break;
            case 2:
                int sub = s1 + s2;
                System.out.println(sub);
                break;
            case 3:
                int mul = s1*s2;
                System.out.println(mul);
                break;
            case 4:
                int div =s1/s2;
                System.out.println(div);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }


    }
}

package worksheet3;

import java.util.Scanner;

public class days {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       //TO String input = sc.next();
        //System.out.println(input);

        //String Name = sc.nextLine();
        //System.out.println(Name);
        int a = sc.nextInt();
        sc.close();
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }   
        

    }    
}

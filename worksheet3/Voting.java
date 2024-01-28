package worksheet3;

import java.util.Scanner;

public class Voting {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if(a>18){
            System.out.println("Eligible to Vote ");
        }
        else{
            System.out.println("Not Eligible to Vote");
        }

    }    
}

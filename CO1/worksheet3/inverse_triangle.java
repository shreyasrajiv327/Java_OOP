package worksheet3;

import java.util.Scanner;

public class inverse_triangle {
    public static void main(String args[]){
        System.out.println("Enter value of n");
        Scanner n = new Scanner(System.in);
        int rows =n.nextInt();
        n.close();
       
        for (int i= 0; i<= rows-1; i++)  
        {  
          for (int j=0; j<=i; j++)
           {  
            System.out.print(" ");  
           } 
            for (int k=0; k<=rows-1-i; k++)
            {
                System.out.print("*" + " ");  
            }
               System.out.println();  
             }  
    }
}

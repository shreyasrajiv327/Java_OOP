package Activity2;
import java.util.*;

public class right_triangle
{
    public static void main(String args[]){
        System.out.println("Enter value of n");
        Scanner n = new Scanner(System.in);
        int rows =n.nextInt();
        n.close();
       for(int i=1;i<=rows;i++)
       {
         for(int j=1;j<i;j++)
         {
            System.out.print(i);
         }
         System.out.println();
       }
    }
}
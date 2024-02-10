package Activity2;
import java.util.*;

public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       //TO String input = sc.next();
        //System.out.println(input);

        //String Name = sc.nextLine();
        //System.out.println(Name);
        int a = sc.nextInt();
        sc.close();
        if(a>0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative number");
        }

    }    
}

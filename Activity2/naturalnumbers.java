package Activity2;
import java.util.*;

public class naturalnumbers {
    public static void main(String args[]){
        System.out.println("Enter value of n");
        Scanner n = new Scanner(System.in);

        int num = n.nextInt();
        n.close();
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }
    }
    
}

package worksheet1;
import java.util.Scanner;

public class area {
    public static void main(String arg[]) {
        double  pi = 3.1;
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        double area = pi*r*r;
        System.out.println(area);
        sc.close();


    }
    
}

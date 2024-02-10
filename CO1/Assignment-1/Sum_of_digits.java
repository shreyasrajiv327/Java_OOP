import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args)
    {
        System.out.println("Enter a number between 0 and 1000");
        Scanner sc = new Scanner(System.in);
        int var1 = sc.nextInt();
        int sum=0;
        while(var1>0)
        {
            int var2= var1%10;
            sum=sum+var2;
            var1=var1/10;

        }
        sc.close();
        System.out.println(sum);
    }
}

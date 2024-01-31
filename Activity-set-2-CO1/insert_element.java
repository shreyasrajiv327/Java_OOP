import java.util.Scanner;
public class insert_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at index " + i + ":");
            arr[i] = sc.nextInt();
        }

       
        System.out.println("Enter the new element and its position");
        int k = sc.nextInt();
        int p =sc.nextInt();
        int[] newarr = new int[n+1];
        for (int i = 0; i < n; i++) {
            newarr[i]=arr[i];
        }
        newarr[p-1]=k;
        System.out.println("New array");
        for (int i = 0; i < n+1; i++) {
            System.out.print(newarr[i]);
         }
        sc.close();
    }
}

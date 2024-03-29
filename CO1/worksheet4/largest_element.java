package worksheet4;
import java.util.Scanner;

public class largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at index " + i + ":");
            arr[i] = sc.nextInt();
        }

        sc.close(); 

        int max = arr[0];
        for (int i = 1; i < n; i++) { 
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The largest element is: " + max);
    }
}

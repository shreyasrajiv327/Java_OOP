package worksheet4;

import java.util.Scanner;

public class reverse_array {
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
        int j =0;
        int[] rev = new int[n];
        for (int i = n-1; i >=0; i--) { 
            rev[j]=arr[i];
            j ++;
        }
        System.out.println("Reversed array");
        for (int i = 0; i < n; i++) {
            System.out.print(rev[i] + " ");
         }

    }
    
}

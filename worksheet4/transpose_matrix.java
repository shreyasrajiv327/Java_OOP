package worksheet4;

import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows in the matrix:");
        int r = sc.nextInt();

        System.out.println("Enter the number of columns in the matrix:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        int[][] tra = new int[c][r];

       
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                tra[j][i] = arr[i][j];
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(tra[i][j] + " ");
            }
            System.out.println();
        }
    }
}

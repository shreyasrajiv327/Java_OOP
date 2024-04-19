// Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line. The program shall print "Coza" in place of the numbers which are multiples of 3, "Loza" for multiples of 5, "Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5, and so on.

package Extras;

public class Coza_Loza_Woza {
    public static void main(String[] args) {
        final int lower = 1, upper = 110;
        boolean processed = false;

        for (int number = lower; number <= upper; ++number) {
            processed = false;
            if (number % 3 == 0) {
                System.out.print("Coza");
                processed = true;
            }
            if (number % 5 == 0) {
                System.out.print("Loza");
                processed = true;
            }
            if (number % 7 == 0) {
                System.out.print("Woza");
                processed = true;
            }
            if (!processed) {
                System.out.print(number);
            }
            if (number % 11 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}

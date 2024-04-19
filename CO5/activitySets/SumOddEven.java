// Modify the program to produce two sums: sum of odd numbers and sum of even numbers from 1 to 100. Also computer their absolute difference.
package Extras;

public class SumOddEven {
    public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        absDiff = Math.abs(sumOdd - sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Absolute difference: " + absDiff);
    }
}




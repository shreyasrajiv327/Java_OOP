package PackageC;

import PackageA.PalindromeChecker;
import PackageB.OddEvenChecker;

public class Main {
    public static void main(String[] args) {
        int number1 = 12321; // Example palindrome number
        int number2 = 42;    // Example non-palindrome number

        // Palindrome check
        if (PalindromeChecker.isPalindrome(number1)) {
            System.out.println(number1 + " is a palindrome.");
        } else {
            System.out.println(number1 + " is not a palindrome.");
        }

        if (PalindromeChecker.isPalindrome(number2)) {
            System.out.println(number2 + " is a palindrome.");
        } else {
            System.out.println(number2 + " is not a palindrome.");
        }

        // Odd/Even check
        System.out.println("Number " + number1 + " is " + OddEvenChecker.checkOddEven(number1));
        System.out.println("Number " + number2 + " is " + OddEvenChecker.checkOddEven(number2));
    }
}

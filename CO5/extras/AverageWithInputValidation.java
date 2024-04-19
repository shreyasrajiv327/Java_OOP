package Extras;

import java.util.Scanner;
public class AverageWithInputValidation {
   public static void main(String[] args) {
       final int NUM_STUDENTS = 3;
       int sum = 0;
       double average;
       Scanner scanner = new Scanner(System.in);

       for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
           System.out.print("Enter the mark (0-100) for student " + studentNo + ": ");
           boolean validInput = false;

           while (!validInput) {
               String input = scanner.nextLine();


               try {
                   int mark = Integer.parseInt(input);
                   if (mark >= 0 && mark <= 100) {
                       sum += mark;
                       validInput = true;
                   } else {
                       System.out.println("Invalid input, try again...");
                   }
               } catch (NumberFormatException e) {
                   System.out.println("Invalid input, try again...");
               }
           }
       }
       average = (double) sum / NUM_STUDENTS;
       System.out.printf("The average is: %.2f%n", average);
       scanner.close();
   }
}
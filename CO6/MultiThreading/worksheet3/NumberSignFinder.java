// Write a Java program which first generates a set of random numbers and then determines negative, positive even, positive odd numbers concurrently.

package worksheet3;

import java.util.Random;

class NumberGenerator extends Thread {
    private int[] numbers;
    private int[] result;
    private String type;

    public NumberGenerator(int[] numbers, String type) {
        this.numbers = numbers;
        this.type = type;
    }

    @Override
    public void run() {
        switch (type) {
            case "negative":
                for (int number : numbers) {
                    if (number < 0) {
                        result[0]++;
                    }
                }
                break;
            case "positive_even":
                for (int number : numbers) {
                    if (number > 0 && number % 2 == 0) {
                        result[1]++;
                    }
                }
                break;
            case "positive_odd":
                for (int number : numbers) {
                    if (number > 0 && number % 2 != 0) {
                        result[2]++;
                    }
                }
                break;
        }
    }

    public void setResultArray(int[] result) {
        this.result = result;
    }
}

public class NumberSignFinder {
    public static void main(String[] args) {
        // Generate random numbers
        Random random = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(200) - 100; // Generate numbers between -100 and 100
        }

        // Create threads for each type of number
        int[] result = new int[3]; // 0: negative, 1: positive even, 2: positive odd
        NumberGenerator negativeThread = new NumberGenerator(numbers, "negative");
        NumberGenerator positiveEvenThread = new NumberGenerator(numbers, "positive_even");
        NumberGenerator positiveOddThread = new NumberGenerator(numbers, "positive_odd");

        negativeThread.setResultArray(result);
        positiveEvenThread.setResultArray(result);
        positiveOddThread.setResultArray(result);

        // Start threads
        negativeThread.start();
        positiveEvenThread.start();
        positiveOddThread.start();

        // Wait for threads to finish
        try {
            negativeThread.join();
            positiveEvenThread.join();
            positiveOddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print results
        System.out.println("Negative numbers: " + result[0]);
        System.out.println("Positive even numbers: " + result[1]);
        System.out.println("Positive odd numbers: " + result[2]);
    }
}
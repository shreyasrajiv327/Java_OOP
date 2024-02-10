public class PrimeNumbers {
    public static void main(String[] args) {
        final int TOTAL_PRIMES = 50;
        final int PRIMES_PER_LINE = 10;

        int count = 0;
        int number = 2;

        while (count < TOTAL_PRIMES) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;

   
                if (count % PRIMES_PER_LINE == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }


    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

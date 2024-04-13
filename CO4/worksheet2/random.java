import java.util.Random;

class random {

    public static void printRandoms(int lower, int upper) {
        Random rand = new Random();
        int num = rand.nextInt(upper - lower + 1) + lower;
        System.out.println(num);
    }
    public static void main(String[] args) {
        int lower = 10;
        int upper = 50;
        for(int i=0; i<10; i++) {
            printRandoms(lower, upper);
        }
    }
}
class OddThread extends Thread {
    public void run() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100); // Introduce a delay of 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        System.out.println("Even numbers:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100); // Introduce a delay of 100 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have completed their execution.");
    }
}
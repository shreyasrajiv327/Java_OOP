class GoodMorningThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good morning");
            try {
                // Pause the thread for a short period (optional)
                Thread.sleep(1000);  // Sleep for 1 second between prints (adjust as needed)
            } catch (InterruptedException e) {
                System.out.println("GoodMorningThread interrupted.");
            }
        }
    }
}

class WelcomeRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                // Delay execution for 200 ms
                Thread.sleep(200);  // Sleep for 200 ms between prints
            } catch (InterruptedException e) {
                System.out.println("WelcomeRunnable interrupted.");
            }
        }
    }
}

public class ContinuousPrintDemo {
    public static void main(String[] args) {
        // Create and start the "Good morning" thread
        GoodMorningThread goodMorningThread = new GoodMorningThread();
        goodMorningThread.start();
        
        // Create and start the "Welcome" thread
        WelcomeRunnable welcomeRunnable = new WelcomeRunnable();
        Thread welcomeThread = new Thread(welcomeRunnable);
        welcomeThread.start();
    }
}

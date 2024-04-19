class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread created by extending Thread: Starting...");
            // Pause the thread for 2 seconds
            Thread.sleep(2000);
            System.out.println("Thread created by extending Thread: Finished sleeping.");
        } catch (InterruptedException e) {
            System.out.println("Thread created by extending Thread: Interrupted.");
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        try {
            System.out.println("Thread created by implementing Runnable: Starting...");
            // Pause the thread for 2 seconds
            Thread.sleep(2000);
            System.out.println("Thread created by implementing Runnable: Finished sleeping.");
        } catch (InterruptedException e) {
            System.out.println("Thread created by implementing Runnable: Interrupted.");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Create and start the thread by extending Thread
        MyThread thread1 = new MyThread();
        thread1.start();

        // Create and start the thread by implementing Runnable
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("All threads have finished.");
    }
}

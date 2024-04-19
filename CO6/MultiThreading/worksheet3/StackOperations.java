package worksheet3;

// Write a Java program which handles Push operation and Pop operation on stack concurrently. Use wait and notify.



import java.util.Stack;

class StackManager {
    private Stack<Integer> stack = new Stack<>();
    private int capacity;

    public StackManager(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void push(int value) {
        while (stack.size() == capacity) {
            try {
                wait(); // Wait if stack is full
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stack.push(value);
        System.out.println("Pushed: " + value);
        notify(); // Notify waiting threads that item is pushed
    }

    public synchronized int pop() {
        while (stack.isEmpty()) {
            try {
                wait(); // Wait if stack is empty
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int value = stack.pop();
        System.out.println("Popped: " + value);
        notify(); // Notify waiting threads that item is popped
        return value;
    }
}

class PushThread extends Thread {
    private StackManager stackManager;
    private int value;

    public PushThread(StackManager stackManager, int value) {
        this.stackManager = stackManager;
        this.value = value;
    }

    @Override
    public void run() {
        stackManager.push(value);
    }
}

class PopThread extends Thread {
    private StackManager stackManager;

    public PopThread(StackManager stackManager) {
        this.stackManager = stackManager;
    }

    @Override
    public void run() {
        stackManager.pop();
    }
}

public class StackOperations {
    public static void main(String[] args) {
        StackManager stackManager = new StackManager(5);

        // Creating multiple threads for pushing and popping
        PushThread pushThread1 = new PushThread(stackManager, 1);
        PushThread pushThread2 = new PushThread(stackManager, 2);
        PopThread popThread1 = new PopThread(stackManager);
        PopThread popThread2 = new PopThread(stackManager);

        // Starting threads
        pushThread1.start();
        pushThread2.start();
        popThread1.start();
        popThread2.start();
    }
}
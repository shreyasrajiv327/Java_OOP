package CO3;
// Abstract Parent class
abstract class Parent {
    // Abstract method
    abstract void message();
}

// First subclass
class FirstSubclass extends Parent {
    // Implementing abstract method
    void message() {
        System.out.println("This is the first subclass");
    }
}

// Second subclass
class SecondSubclass extends Parent {
    // Implementing abstract method
    void message() {
        System.out.println("This is the second subclass");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects for each subclass
        FirstSubclass firstObj = new FirstSubclass();
        SecondSubclass secondObj = new SecondSubclass();

        // Calling the message method for each object
        firstObj.message();
        secondObj.message();
    }
}

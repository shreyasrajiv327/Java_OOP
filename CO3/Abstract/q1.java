package CO3.Abstract;

abstract class Parent {
    public abstract void message();
}

class Subclass1 extends Parent {
    public void message() {
        System.out.println("This is first subclass");
    }
}

class Subclass2 extends Parent {
    public void message() {
        System.out.println("This is second subclass");
    }
}

public class q1 {
    public static void main(String[] args) {
        Subclass1 obj1 = new Subclass1();
        obj1.message();

        Subclass2 obj2 = new Subclass2();
        obj2.message();
    }
}
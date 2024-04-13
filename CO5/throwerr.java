package CO5;

public class throwerr {
    static void testMethod(int age){
        if (age < 18){
            throw new ArithmeticException("not valid");
        }
        else{
            System.out.println("Welcome to vote");
        }
    }
    
    public static void main(String args[]){
        try {
            testMethod(20); // You can pass the age as an argument here
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

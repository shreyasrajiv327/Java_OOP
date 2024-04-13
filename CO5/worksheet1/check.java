package CO5.worksheet1;
public class check {
    // Method to check if a number is even
    public static void checkNumber(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Number is odd.");
        } else {
            System.out.println("Number is even.");
        }
    }

    // Main method to test the checkNumber method
    public static void main(String[] args) {
        try {
            checkNumber(3); // Should throw an exception
            checkNumber(4); // Should print "Number is even."
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class OddException extends Exception{
    public OddException(String message){
        super(message);
    }
}
class NumberChecker{
    public void checkOE(int N) throws OddException{
        if (N%2 != 0)
        {
            throw new OddException("Its an OddNumber Bruv");
        }
        else{
            System.out.println("Its Even Number");
        }
    }
}

public class OddEven{
    public static void main(String[] args) {
        NumberChecker N = new NumberChecker();
        try{
            //N.checkOE(7);
            N.checkOE(8);

        } catch (OddException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
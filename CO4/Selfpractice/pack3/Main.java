package pack3;
import pack1.Palindrome;
import pack2.OddEven;
public class Main {
    public static void main(String[] args) {
        Palindrome P = new Palindrome();
        P.checkPalindrome(121);
        P.checkPalindrome(221);
        OddEven OE = new OddEven();
        OE.checkOE(23);
        OE.checkOE(24);
    }
}

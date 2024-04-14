package pack1;
public class Palindrome{
    public void checkPalindrome(int num1)
    {
        int res = num1;
        int sum = 0;
        int temp;
        while(res>0){
            temp = res%10;
            sum  = (sum*10) + temp;
            res = res/10;
        }
        System.out.println("Value of Sum is " + sum);
        if (sum==num1)
        {
            System.out.println("Number is a Palindrome");
        }
        else{
            System.out.println("Number is not a  Palindrome");
        }
        
    }
}


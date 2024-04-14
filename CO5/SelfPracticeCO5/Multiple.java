public class Multiple {
    public static void main(String[] args) {
        try{
            int[] array = {1,2,3};
            System.out.println("Accessing array element at index 3: " + array[3]);

            int result = 10/0;
            System.out.println("Result of division: " + result);

            String str =  null;
            System.out.println("Length of string: " + str.length());
            String invalidNumber = "abc";
            // Trying to parse an invalid number will cause NumberFormatException
            int parsedNumber = Integer.parseInt(invalidNumber);
            System.out.println("Parsed number: " + parsedNumber);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}

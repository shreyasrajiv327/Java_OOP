package CO5.worksheet1;

public class exception {
    // Method to display color for a given character
    public static void displayColor(char ch) throws Exception {
        // Check if the character is an alphabet
        if (!Character.isLetter(ch)) {
            throw new Exception("Input should be an alphabet.");
        }

        // Convert the character to lowercase for easier comparison
        ch = Character.toLowerCase(ch);

        // Define rainbow colors
        char[] rainbowColors = {'r', 'o', 'y', 'g', 'b', 'i', 'v'};
        String[] colorNames = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};

        // Check if the character corresponds to a color of the rainbow
        boolean isRainbowColor = false;
        for (int i = 0; i < rainbowColors.length; i++) {
            
            if (ch == rainbowColors[i]) {
                System.out.println("The color of the rainbow for the letter " + ch + " is " + colorNames[i]);
                isRainbowColor = true;
                break;
            }
        }

        // If the character is not a color of the rainbow, throw an exception
        if (!isRainbowColor) {
            throw new Exception("The alphabet is not a color of the rainbow.");
        }
    }

    // Main method to test the displayColor method
    public static void main(String[] args) {
        try {
            displayColor('r'); // Should print "The color of the rainbow for the letter r is Red"
            displayColor('x'); // Should throw an exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}



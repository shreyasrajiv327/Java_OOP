// Create a new class Restaurant in the Java project SwiftFood
// displayRestaurantDetails() - Display the details of the restaurant (the values of the member variables)
// Create an object of the Restaurant class, initialize the instance variables, and invoke the displayRestaurantDetails() method in the main() method of the Tester class.

import java.util.*;

class Restaurant {
    String restaurantName, restaurantAddress;
    long restaurantContact;
    float rating;

    public Restaurant(String resName, long resContact, String resAddress, float rate) {
        this.restaurantName = resName;
        this.restaurantContact = resContact;
        this.restaurantAddress = resAddress;
        this.rating = rate;
    }

    void displayRestaurantDetails() {
        System.out.println("Restaurant Details");
        System.out.println("******************");
        System.out.println("Restaurant Name : " + restaurantName);
        System.out.println("Rating : " + rating);
        System.out.println("Restaurant Contact : " + restaurantContact);
        System.out.println("Restaurant Address : " + restaurantAddress);
    }
}

public class SwiftFood {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Restaurant Name : ");
        String restaurantName = scanner.nextLine();

        System.out.print("Enter Restaurant Address : ");
        String restaurantAddress = scanner.nextLine();

        System.out.print("Enter Restaurant Contact : ");
        long restaurantContact = scanner.nextLong();

        System.out.print("Enter Restaurant Rating : ");
        float rating = scanner.nextFloat();

        Restaurant obj1 = new Restaurant(restaurantName, restaurantContact, restaurantAddress, rating);
        obj1.displayRestaurantDetails();

        scanner.close();
    }
}
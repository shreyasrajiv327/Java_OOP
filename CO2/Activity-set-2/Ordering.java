// Order() - Set the value of status to 'Ordered'.
// Order(int orderId, String orderedFoods)- Initialize the instance variables appropriately with the values passed to the constructor. Set the value of status to 'Ordered'.
// Create an object of the Order class by using the parameterless constructor and display the value of the status instance variable in the main() method of the Tester class. 
// Create one more object of the Order class by using the parameterized constructor and display the value of orderId, orderFoods and status instance variables in the main() method of the Tester class.

import java.util.*;

class Order {
    String status = "Not ordered", orderedFoods;
    int orderId;

    Order() {
        this.status = "Ordered";
        System.out.println("Status of order 1 : " + status);
    }

    public Order(int orderId, String orderedFoods) {
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
        this.status = "Ordered"; 
        System.out.println("Order ID : " + orderId);
        System.out.println("Ordered Foods:  " + orderedFoods);
        System.out.println("Status of order 2 : " + status);
    }
}

public class Ordering {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter food items to be ordered : ");
        String foodList = scan.nextLine();

        System.out.println("Details for Order 1");
        Order defaultOrder = new Order();
        System.out.println();
        
        System.out.println("Details for Order 2");
        Order parameterizedOrder = new Order(123, foodList);
        scan.close();
    }
}
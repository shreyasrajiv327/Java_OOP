import java.util.Scanner;

class Restaurant {
    String rest_name;
    long rest_contact;
    String rest_add;
    float rest_rate;

    Restaurant(String rest_name, long rest_contact, String rest_add, float rest_rate) {
        this.rest_name = rest_name;
        this.rest_contact = rest_contact;
        this.rest_add = rest_add;
        this.rest_rate = rest_rate;
    }

    void display() {
        System.out.println("Restaurant details");
        System.out.println("******");
        System.out.println("Restaurant name: " + rest_name);
        System.out.println("Restaurant rating: " + rest_rate);
        System.out.println("Restaurant contact: " + rest_contact);
        System.out.println("Restaurant address: " + rest_add);
    }
}

public class SwiftFood {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Restaurant name: ");
        String name = scan.nextLine();
        System.out.print("Enter Restaurant contact: ");
        long contact = scan.nextLong();
        scan.nextLine();
        System.out.print("Enter Restaurant address: ");
        String address = scan.nextLine();
        System.out.print("Enter Restaurant rating: ");
        float rating = scan.nextFloat();
        Restaurant obj = new Restaurant(name, contact, address, rating);
        obj.display();
    }
}

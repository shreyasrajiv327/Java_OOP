import java.util.HashMap;
interface Product {
   String getName();
   String getCategory();
   String getBrand();
   double getPrice();
}
abstract class BaseProduct implements Product {
   private String name;
   private String category;
   private String brand;
   private double price;
   BaseProduct(String name, String category, String brand, double price) {
       this.name = name;
       this.category = category;
       this.brand = brand;
       this.price = price;
   }
   @Override
   public String getName() {
       return name;
   }
   @Override
   public String getCategory() {
       return category;
   }
   @Override
   public String getBrand() {
       return brand;
   }
   @Override
   public double getPrice() {
       return price;
   }
}
class Electronics extends BaseProduct {
   Electronics(String name, String brand, double price) {
       super(name, "Electronics", brand, price);
   }
}
class Clothes extends BaseProduct {
   Clothes(String name, String brand, double price) {
       super(name, "Clothes", brand, price);
   }
}
class Jewelry extends BaseProduct {
   Jewelry(String name, String brand, double price) {
       super(name, "Jewelry", brand, price);
   }
}
class Cosmetics extends BaseProduct {
   Cosmetics(String name, String brand, double price) {
       super(name, "Cosmetics", brand, price);
   }
}
class OfferZone {
   private HashMap<String, Double> specialOffers;


   OfferZone() {
       specialOffers = new HashMap<>();
       specialOffers.put("Electronics", 0.1);
       specialOffers.put("Clothes", 0.2);
   }
   double getDiscountedPrice(Product product) {
       double discount = specialOffers.getOrDefault(product.getCategory(), 0.0);
       return product.getPrice() * (1 - discount);
   }
}
public class shop {
   public static void main(String[] args) {
       Product laptop = new Electronics("Laptop", "Dell", 10000);
       Product shirt = new Clothes("Shirt", "Nike", 5000);
       Product necklace = new Jewelry("Necklace", "Tiffany", 20000);
       Product lipstick = new Cosmetics("Lipstick", "MAC", 300);


       System.out.println("Product: " + laptop.getName() + ", Category: " + laptop.getCategory() +
               ", Brand: " + laptop.getBrand() + ", Price: Rs." + laptop.getPrice());


       System.out.println("Product: " + shirt.getName() + ", Category: " + shirt.getCategory() +
               ", Brand: " + shirt.getBrand() + ", Price: Rs." + shirt.getPrice());


       System.out.println("Product: " + necklace.getName() + ", Category: " + necklace.getCategory() +
               ", Brand: " + necklace.getBrand() + ", Price: Rs." + necklace.getPrice());


       System.out.println("Product: " + lipstick.getName() + ", Category: " + lipstick.getCategory() +
               ", Brand: " + lipstick.getBrand() + ", Price: Rs." + lipstick.getPrice());
       OfferZone offerZone = new OfferZone();
       System.out.println("Discounted Price for Laptop: Rs." + offerZone.getDiscountedPrice(laptop));
       System.out.println("Discounted Price for Shirt: Rs." + offerZone.getDiscountedPrice(shirt));
       System.out.println("Discounted Price for Necklace: Rs." + offerZone.getDiscountedPrice(necklace));
       System.out.println("Discounted Price for Lipstick: Rs." + offerZone.getDiscountedPrice(lipstick));
   }
}
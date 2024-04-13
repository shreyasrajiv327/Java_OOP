class Vehicle{
   String model,make;
   public void milage(double km,int l)
   {
      System.out.println("Milage of your vehicle is" + km/l);
   }

   public void fuelefficiency(double nokm,double nol)
   {
    System.out.println("Fuel efficiency of your vehicle is" + nokm/nol);
   }
}

class Bike extends Vehicle{
    Bike(String model,String make){
        super();
        this.model = model;
        this.make = make;
    }

    public void details()
    {
        System.out.println(model+" "+make);
    }



}
public class vehicleInherit {
    public static void main(String[] args) {
        Bike B1 = new Bike("Yamaha","Japan");
        B1.details(); 
        B1.milage(100, 10);
    }
   
}

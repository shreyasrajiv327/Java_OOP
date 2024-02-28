// Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses bike, Car and van. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, mileage. (fuel efficiency=no.of kilometres travelled/no. of litres consumed, mileage= no.of kilometres travelled/litre).


class Vehicle {
    String model, make, fuelType;
    int year;

    void fuelEfficiency(double kms_travelled, double fuel_liters) {
        System.out.println((kms_travelled/fuel_liters));
    }

    void mileage(double km, int l) {
        System.out.println((km/l));
    }
}
    
class bike extends Vehicle{
    void initial(String model, String make, String fuelType, int year) {
        this.model = model;
        this.make = make;
        this.fuelType = fuelType;
        this.year = year;

        System.out.println(model + " " + make + " " + fuelType + " " + year);
    }
}

class car extends Vehicle{
    void initial(String model, String make, String fuelType, int year) {
        this.model = model;
        this.make = make;
        this.fuelType = fuelType;
        this.year = year;

        System.out.println(model + " " + make + " " + fuelType + " " + year);
    }
}

class van extends Vehicle{
    void initial(String model, String make, String fuelType, int year) {
        this.model = model;
        this.make = make;
        this.fuelType = fuelType;
        this.year = year;

        System.out.println(model + " " + make + " " + fuelType + " " + year);
    }
}

public class Q1 {
    public static void main(String[] args) {
        bike bike1 = new bike();
        bike1.initial("Hunter","Royal Enfield", "petrol", 2023);
        bike1.fuelEfficiency(250.0,15.0);
        bike1.mileage(20,1);

        car car1 = new car();
        car1.initial("Compass","Jeep", "diesel", 2022);
        car1.fuelEfficiency(500.0, 40.0);
        car1.mileage(30,1);

        van van1 = new van();
        van1.initial("Omni","Maruti", "petrol", 2015);
        van1.fuelEfficiency(1000.0,10.0);
        van1.mileage(10,1);
    }
}

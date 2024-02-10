import java.util.Scanner;
public class Car {
    String Company_Name;
    String Model_Name;
    double Year_Manufacturing;
    double Milage;
    void assign(String Company_Name,String Model_Name,double Year_Manufacturing,double Milage)
    {
      this.Company_Name = Company_Name;
      this.Model_Name = Model_Name;
      this.Year_Manufacturing = Year_Manufacturing;
      this.Milage =  Milage;
    }

    void display()
    {
        System.out.println("Company of the Car " + Company_Name);
        System.out.println("Model Name "+ Model_Name);
        System.out.println("Year of Manufacturing " + Year_Manufacturing);
        System.out.println("Model Name "+ Model_Name);
    }

    public static void main(String[] args) {
    String Company_Name;
    String Model_Name;
    double Year_Manufacturing;
    double Milage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Company of the Car");
        Company_Name = sc.nextLine();
        System.out.println("Model Name");
        Model_Name = sc.nextLine();
        System.out.println("Year of Manufacturing");
        Year_Manufacturing= sc.nextDouble();
        System.out.println("Model Name");
        Milage = sc.nextDouble();
        Car car = new Car();
        car.assign(Company_Name, Model_Name, Year_Manufacturing, Milage);
        car.display();
        sc.close();
    }
}
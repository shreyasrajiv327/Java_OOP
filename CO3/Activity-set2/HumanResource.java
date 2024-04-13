
class Employee{
     String name;
     double salary;
     String jobDescription;
     public double Salary(double base)
     {
         this.salary=base + (0.12*base) + (0.07*base);
         return salary;
     }


}

class Professor extends Employee{
    Professor(String name,String jobDescription,double BaseSalary)
    {
        super();
        this.name=name;
        this.jobDescription =  jobDescription;
        this.salary=super.Salary(BaseSalary);
    }

    public void display()
    {
        System.out.println("Salary of this proffesor is :" + salary);
    }
}
public class HumanResource {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome");
        String Name = "Shreyas";
        String Position = "Proffesor";
        double ba = 100000;
        Professor PO = new Professor(Name, Position, ba);
        PO.display();
    }
}

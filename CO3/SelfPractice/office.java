abstract class Roles{
    double salary;
    abstract double calculateSalary(double ba);
}

class HeadIT extends Roles{
    
    HeadIT(){
        super();
    }
    @Override
    public double calculateSalary(double BA)
    {
        
        this.salary = BA + (BA*0.05) + (BA*0.07);
        return salary;
    }
}
class HeadProgrammer extends Roles{
    HeadProgrammer(){
        super();
    }
    @Override
    public double calculateSalary(double BA)
    {
        this.salary = BA + (BA*0.08) + (BA*0.1);
        return salary;
    }
}
public class office {
    public static void main(String[] args) {
        HeadIT IT = new HeadIT();
        double sal = IT.calculateSalary(10000);
        System.out.println("Salary of HeadIT "+ sal);

        HeadProgrammer Pro = new HeadProgrammer();
        sal = Pro.calculateSalary(10000);
        System.out.println("Salary of HeadProgrammer "+ sal);
    }
}

import java.util.Scanner;
public class Employee {
    String Name;
    String Job_Title;
    double base_salary;
    double hra;
    double da;

    Employee(String Name,String Job_Title,double base_salary,double hra,double da){
          this.Name=Name;
          this.Job_Title=Job_Title;
          this.base_salary=base_salary;
          this.hra=hra;
          this.da=da;
    }

    double Salary()
    {
        double salary = base_salary + (hra/100)*base_salary + (da/100)*base_salary;
        return salary;
    }
    public static void main(String[] args) {
        String Name;
        String Job_Title;
        double base_salary;
        double hra;
        double da;
        double Salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name");
        Name = sc.nextLine();
        System.out.println("Enter Employee Job Title");
        Job_Title = sc.nextLine();
        System.out.println("Enter Employee Salary");
        base_salary = sc.nextDouble();
        System.out.println("Enter Employee hra");
        hra = sc.nextDouble();
        System.out.println("Enter Employee da");
        da = sc.nextDouble();
        Employee employee = new Employee(Name, Job_Title, base_salary, hra, da);
        Salary = employee.Salary();
        System.out.println("Employee's Full salary "+ Salary);
        sc.close();
    }
}

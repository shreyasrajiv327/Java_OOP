import java.util.Scanner;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    // Default constructor
    public Employee() {
        this("", "", 0);
    }

    // Constructor with name, job title, and salary
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Method to calculate salary without incentive
    public double calculateSalary() {
        double basic = 50000;
        double hra = basic * 0.12;
        double da = basic * 0.05;
        return basic + hra + da;
    }

    // Method to calculate salary with incentive
    public double calculateSalary(double incentive) {
        double basic = 50000;
        double hra = basic * 0.12;
        double da = basic * 0.05;
        return basic + hra + da + incentive;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input from the user
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee job title: ");
        String jobTitle = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(name, jobTitle, salary);

        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Job Title: " + emp.getJobTitle());
        System.out.println("Salary: Rs. " + emp.getSalary());

        System.out.println("Salary without incentive: Rs. " + emp.calculateSalary());
        System.out.print("Enter incentive: ");
        double incentive = scanner.nextDouble();
        System.out.println("Salary with incentive: Rs. " + emp.calculateSalary(incentive));

        scanner.close();
    }

   s
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

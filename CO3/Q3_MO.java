class Employee {
    private String name;
    private String jobTitle;
    private double basicSalary;
    private double hra;
    private double da;
    private double incentive;

    // Constructor with name, jobtitle, and basic salary
    public Employee(String name, String jobTitle, double basicSalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
        this.hra = 0.12 * basicSalary;
        this.da = 0.05 * basicSalary;
        this.incentive = 1500;
    }

    // Method to calculate salary without incentive
    public double salary() {
        return basicSalary + hra + da;
    }

    // Method to calculate salary with incentive
    public double salary(double incentive) {
        return salary() + incentive;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
}

public class Q3_MO {
    public static void main(String[] args) {
        // Creating an Employee object with constructor having name, jobtitle, and basic salary
        Employee emp1 = new Employee("John Doe", "Software Engineer", 50000);

        // Displaying details and salary of emp1
        System.out.println("Employee 1 Details:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Job Title: " + emp1.getJobTitle());
        System.out.println("Basic Salary: Rs. " + emp1.getBasicSalary());
        System.out.println("Salary without Incentive: Rs. " + emp1.salary());
        System.out.println("Salary with Incentive: Rs. " + emp1.salary(1500));

        // Creating another Employee object with constructor having name, jobtitle, and basic salary
        Employee emp2 = new Employee("Jane Smith", "HR Manager", 60000);

        // Displaying details and salary of emp2
        System.out.println("\nEmployee 2 Details:");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Job Title: " + emp2.getJobTitle());
        System.out.println("Basic Salary: Rs. " + emp2.getBasicSalary());
        System.out.println("Salary without Incentive: Rs. " + emp2.salary());
        System.out.println("Salary with Incentive: Rs. " + emp2.salary(1500));
    }
}
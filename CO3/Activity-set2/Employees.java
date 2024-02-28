// Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Teacher, Lecturer, and Professor. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating salary, bonuses, generating performance reports. (Hint: use super keyword, basic salary for professor=50,000, basic salary for lecturer=40000, basic salary for teacher=30000, hra=12%, da=7%, bonus=2%, print any one these string for performance reports –excellent, good, satisfied)



class Employee {
    String name, address, jobTitle;
    double salary;

    Employee() {
        System.out.println("displayed the details of employee");
    }

    void Salary() {
        double salary=(30000+(0.12*30000)+(0.07*30000));
        System.out.println(salary);
    }
    void Bonus() {
        System.out.println(0.02*30000);
    }
    void PerformanceReport() {
        System.out.println("excellent");
    }
}

class Teacher extends Employee{
    Teacher(String name, String address, String jobTitle, double salary) {
        super();
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;

        System.out.println(name + " " + address + " " + jobTitle + " " + salary);
    }
}

class Lecturer extends Employee{
    Lecturer(String name, String address, String jobTitle, double salary) {
        super();
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;

        System.out.println(name + " " + address + " " + jobTitle + " " + salary);
    }
}

class Professor extends Employee{
    Professor(String name, String address, String jobTitle, double salary) {
        super();
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;

        System.out.println(name + " " + address + " " + jobTitle + " " + salary);
    }
}

public class Employees {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Monish", "Bengaluru", "Assistant Teacher", 5000);
        teacher1.Salary();
        teacher1.Bonus();
        teacher1.PerformanceReport();

        Lecturer lecturer1 = new Lecturer("Shreyas", "Bengaluru", "Assistant Lecturer", 6000);
        lecturer1.Salary();
        lecturer1.Bonus();
        lecturer1.PerformanceReport();

        Professor professor1 = new Professor("Reethu", "Bengaluru", "HOD", 10000);
        professor1.Salary();
        professor1.Bonus();
        professor1.PerformanceReport();
    }
}

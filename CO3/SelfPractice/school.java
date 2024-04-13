class Employee{
    String Jobtitle;
    double salary;

    public void Salary(double baseAmount)
    {
        this.salary = baseAmount + (0.12*baseAmount) + (0.7*baseAmount);
        System.out.println("Your Salary is : " + salary);
    }
}

class Teacher extends Employee{
    Teacher(String jobtitle){
        //super();
        this.Jobtitle = jobtitle;
        
    }


}
public class school {
    public static void main(String[] args) {
        Teacher T1= new Teacher("Teacher");
        T1.Salary(100000);
    }
}

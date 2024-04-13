class Employee
{
String name, jobtitle;
double basic, hra, da, incentive;
Employee()//this is for ob3
{
  System.out.println("Sup");
}
Employee(String j,double b, double h,double d,double i) //this is for ob1
{
    this.name = j;
    this.basic = b;
    this.hra = d;
    this.incentive = i;
}
Employee(String j, double b, double h,double d)//this is for ob2
{
    this.name = j;
    this.basic = b;
    this.hra = d;
}
void Salary(String name,String x)// this is for ob1

{ double sal = basic + (basic * hra) + (basic * da) + incentive; // Calculate salary
    System.out.println(name + " " + x);
    System.out.println("Salary: " + sal);
//x is for printing “employee got incentive” , print name, print sal
}
void Salary(String name)//this is for ob2
{
//don’t add incentive
double sal = basic + (basic * hra) + (basic * da); // Calculate salary without incentive
System.out.println(name);
System.out.println("Salary: " + sal);
//print name and sal
}
}
public class test
{
public static void main(String args[])
{
    Employee ob1 = new Employee("engineer", 50000, 0.12, 0.05, 1500);
    Employee ob2 = new Employee("doctor", 50000, 0.12, 0.05);
    Employee ob3 = new Employee();

    // Calling the salary methods
    ob1.Salary("Aditya", "got incentive");
    ob2.Salary("Arun");
    
}}
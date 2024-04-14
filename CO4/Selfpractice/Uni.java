/**
 * Uni
 */
interface Dept {
    String dept = "Btech-CSE";
    String deptHead = "Dr.Shreyas";
    public void printDept();
    public void printDeptHead();
    
}
class Hostel{
    String hostelName,hostelLocaiton;
    int roomNo;

    Hostel(String hostelN,String hostelL,int no)
    {
        this.hostelName = hostelN;
        this.hostelLocaiton = hostelL;
        this.roomNo =  no;
    }

    public void display()
    {
        System.out.println("Hostel Name "+hostelName+"Hostel Location " + hostelLocaiton +"No of rooms " +  roomNo);
    }
}


class Student extends Hostel implements Dept{

    String Name,Elective;
    Student(String N, String E, String hostelName, String hostelLocation, int roomNo)
    {
        super(hostelName, hostelLocation, roomNo);
        this.Name = N;
        this.Elective =E;
    }
    public void printDept(){
        System.out.println("Name of the Dept " + dept);
    }
    public void printDeptHead(){
        System.out.println("Name of Head of Dept " + deptHead);
    }
}


public class Uni{
    public static void main(String[] args) {
        Student S1 = new Student("Jack","Drumming","ThecoolOnes","BakerStreet",69);
        S1.printDept();
        S1.printDeptHead();
        S1.display();
    }
}
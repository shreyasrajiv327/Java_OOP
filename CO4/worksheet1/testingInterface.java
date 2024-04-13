// Create an interface Department containing attributes deptName and deptHead. It also has methods for printing the attributes Create a class hostel containing hostelName, hostelLocation and numberOfRooms. The class contains method printing the attributes Then write Student class extending the Hostel class and implementing the Department interface. This class contains attributes studentName, regdNo, electiveSubject and avgMarks. Write suitable printData method for this class.  Also, implement the methods of the Department interface.

interface Department {
    String deptName = "CSE"; 
    String deptHead = "Dr.Shreyas";
    void printDeptDetails();
}

class Hostel {
    String hostelName, hostelLocation;
    int numberOfRooms;

    public Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    public void printHostelDetails() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName, regdNo, electiveSubject;
    double avgMarks;

    public Student(String hostelName, String hostelLocation, int numberOfRooms, String studentName, String regdNo, String electiveSubject, double avgMarks) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

    public void printData() {
        printHostelDetails();
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
    }

    @Override
    public void printDeptDetails() {
        System.out.println("Department: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }
}

public class testingInterface {
    public static void main(String[] args) {
        Student student = new Student("XYZ Hostel", "City Center", 100, "John Doe", "ABC123", "Computer Science", 85.5);
        student.printData();
        student.printDeptDetails();
    }
}
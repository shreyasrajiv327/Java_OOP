// Interface Department
interface Department {
    void printAttributes();
}

// Class Hostel
class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    void printAttributes() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

// Class Student implementing Department interface and extending Hostel class
class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;

    Student(String hostelName, String hostelLocation, int numberOfRooms, String studentName, int regdNo, String electiveSubject, double avgMarks) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

    void printData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
    }

    @Override
    public void printAttributes() {
        super.printAttributes();
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Student student = new Student("XYZ Hostel", "ABC Location", 100, "John Doe", 12345, "Mathematics", 85.5);
        student.printAttributes(); // Printing hostel attributes
        student.printData(); // Printing student data
    }
}

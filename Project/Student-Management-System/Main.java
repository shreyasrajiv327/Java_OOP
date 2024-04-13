import grades.Grade;
import attendance.Attendance;
import InformationManagement.Student;
import InformationManagement.StudentManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create StudentManagementSystem object
        StudentManagementSystem sms = new StudentManagementSystem();

        // Create new students
        sms.addStudent(new Student(1, "Alice", new Grade("A"), new Attendance(true)));
        sms.addStudent(new Student(2, "Bob", new Grade("B"), new Attendance(true)));
        sms.addStudent(new Student(3, "Ramesh", new Grade("B+"), new Attendance(false)));
        sms.addStudent(new Student(4, "Sanjay", new Grade("A-"), new Attendance(true)));

        // Read and display students
        System.out.println("Students List:");
        sms.viewStudents();

        // Update student's details
        sms.updateStudent(2, "Robert", new Grade("A+"), new Attendance(true));
        System.out.println("\nAfter updating Bob's details:");
        sms.viewStudents();

        // Search for a student by name
        System.out.println("\nSearching for Ramesh:");
        Student foundStudent = sms.searchStudentByName("Ramesh");
        System.out.println(foundStudent != null ? foundStudent : "Student not found.");

        // Delete a student
        sms.deleteStudent(1);
        System.out.println("\nAfter deleting Alice:");
        sms.viewStudents();
    }
}

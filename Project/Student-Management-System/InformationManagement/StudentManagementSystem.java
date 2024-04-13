package InformationManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void viewStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void updateStudent(int id, String name, grades.Grade grade, attendance.Attendance attendance) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setGrade(grade);
                student.setAttendance(attendance);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Overloading
    public void updateStudent(int id, String name, grades.Grade grade) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setGrade(grade);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public Student searchStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
}

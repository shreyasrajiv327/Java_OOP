package InformationManagement;

import attendance.Attendance;
import grades.Grade;

public class Student extends Person{
    private int id;
    private String name;
    private grades.Grade grade;
    private attendance.Attendance attendance;

    public Student(int id, String name, Grade grade, Attendance attendance) {
        super(id, name);
        this.grade = grade;
        this.attendance = attendance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public grades.Grade getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(grades.Grade grade) {
        this.grade = grade;
    }

    public attendance.Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(attendance.Attendance attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", " + grade + ", " + attendance;
    }

    @Override
    public String getRole() {
        return "Student";
    }
}

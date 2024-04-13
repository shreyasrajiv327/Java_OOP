package grades;

public class Grade {
    private String grade;

    public Grade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Overriding 
    @Override
    public String toString() {
        return "Grade: " + grade;
    }
    
}

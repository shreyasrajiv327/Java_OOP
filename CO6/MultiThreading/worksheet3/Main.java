package worksheet3;
class Course{
     String courseName,CourseInstructor;
     Course(String N,String I)
     {
        this.courseName =  N;
        this.CourseInstructor = I;
     }

     public void getTeacher()
     {
        System.out.println("Course: "+ courseName + "Teacher Name" + CourseInstructor);
     }
}

class StudentA extends Thread{
    Course c;
    StudentA(Course c)
    {
        this.c =c;
    }
    public synchronized void run()
    {
        c.getTeacher();
    }
}

class StudentB extends Thread{
    Course c;
    StudentB(Course c)
    {
        this.c =c;
    }
    public synchronized void run()
    {
        c.getTeacher();
    }
}

public class Main{
    public static void main(String[] args) {
        Course c1 = new Course("OS","Mouli Sir");
        Course c2 = new Course("Agile","CVSN Sir");
        StudentA s1 = new StudentA(c1);
        StudentB s2 = new StudentB(c2);
        s1.start();
        s2.start();
    }
}

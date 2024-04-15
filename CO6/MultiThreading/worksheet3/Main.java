package worksheet3;
class Course{
    String Teacher;
    String CourseName;
    Course(String T,String C){
        this.CourseName =C;
        this.Teacher =T;
    }

    public synchronized void getTeacher(){
         System.out.println("Course Name :" + CourseName + "Course Head :" + Teacher);
    }
}

class StudentA extends Thread{
    Course X;
    StudentA(Course A){
        this.X = A;
    }

    public void run(){
        X.getTeacher();
    }
}
class StudentB extends Thread{
    Course X;
    StudentB(Course A){
        this.X = A;
    }

    public void run(){
        X.getTeacher();
    }
}
/**
 * Main
 */
public class Main {
   public static void main(String[] args) {
     Course c1 = new Course("DSA","Shabeer Basha");
     Course c2 = new Course("IML","Shabeer Basha");
     StudentA s1 = new StudentA(c1);
     StudentB s2 = new StudentB(c2);
     s1.start();
     s2.start();
   }
    
}
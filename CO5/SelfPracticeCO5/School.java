class AgeExceptions extends Exception{
      public AgeExceptions(String msg){
        super(msg);
      }
}
class Student{
    String Name;
    int age;

    Student(String N,int a){
        this.Name = N;
        this.age = a;
    }

    public void agechecker() throws AgeExceptions{
        if(age>21 || age<15){
            throw new AgeExceptions("Age not withing the range");
        }
        else{
            System.out.println("Age within the range");
        }
    }
}
public class School {
    public static void main(String[] args) {
        
   
    Student S1 = new Student("Shreyas",13);
    try{
        S1.agechecker();
    }
    catch(AgeExceptions e)
    {
        System.out.println(e.getMessage());
    }
}
}

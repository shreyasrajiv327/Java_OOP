class AgeException extends Exception{
    AgeException(String msg)
    {
        super(msg);
    }
}

class Student{
    String Name;
    int age;
    Student(String N,int a)
    {
        this.Name =N;
        this.age = a;
    }
    public void checkAge() throws AgeException{
          if(age>21 || age<15)
          {
             throw new AgeException("Invalid Age");
          }
          else{
            System.out.println("Age is fine");
          }
    }
}
public class School {
    public static void main(String[] args) {
        Student S1 = new Student("Shreyas",13);
       try{
        S1.checkAge();
       }catch(AgeException e)
       {
         System.out.println(e.getMessage());
       }
   
}
}

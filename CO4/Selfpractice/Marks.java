class Student {
    String name;
    Student(String n) {
        this.name = n;
    }
}
interface Internals{
    public void calcInternals();
}
interface Externals{
    public void calcExternals();
}

class Result extends Student implements Internals,Externals{
     double InternalMarks;
     double SEE;
     double result;
    Result(String Name,double i,double e){
        super(Name);
        this.InternalMarks = i;
        this.SEE = e;
    }
    public void calcInternals()
    {
        InternalMarks = InternalMarks*0.7;
        System.out.println("Internal Marks are " + InternalMarks);
    }

    public void calcExternals()
    {
        SEE = SEE*0.3;
        System.out.println("Final Marks are " + SEE);
    }
    
    public void display()
    {
         result = SEE + InternalMarks;
         System.out.println("Result " + result);
    }
     
}
public class Marks {
    public static void main(String[] args) {
        Result R=  new Result("Shreyas",100,100);
        R.calcInternals();
        R.calcExternals();
        R.display();
    }
}

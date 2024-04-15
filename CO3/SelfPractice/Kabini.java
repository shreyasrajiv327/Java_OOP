abstract class Animal{
    String Name;
    int Count;
        Animal(String Name,int Count)
        {
           this.Name = Name;
           this.Count = Count;
        }

    // public void display()
    // {

    // }
}

class CountException extends Exception{
    CountException(String msg)
    {
        super(msg);
    }
}
interface count{
    public void display()throws CountException;
}

class Tiger extends Animal implements count{
    Tiger(String Name,int Count)
    {
        super(Name,Count);
        this.Name =Name;
        this.Count =Count;
    }

    public void display()throws CountException
    {   if(Count==0)
        {
            throw new CountException("count is 0! for " + Name);
        }
        else{
        System.out.println("The Number of " + Name + "in Kabini are " + Count);
        }
    }
}
class Elephant extends Animal implements count{
    Elephant(String Name,int Count)
    {
        super(Name,Count);
        this.Name =Name;
        this.Count =Count;
    }
    public void display()throws CountException
    {   if(Count==0)
        {
            throw new CountException("count is 0! for " + Name);
        }
        else{
        System.out.println("The Number of " + Name + "in Kabini are " + Count);
        }
    }

}

class Thread1 extends Thread{
    Elephant E;
    Thread1(Elephant e)
    {
        this.E = e;
    }

    public void run()
    {
        try{
            E.display();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

public class Kabini {
    public static void main(String[] args) {
        Tiger T1 = new Tiger("Tiger",0);
        Elephant E1 = new Elephant("Elephant", 2000);
        Thread1 th = new Thread1(E1);
        th.start();
        try{
           th.join();
           System.out.println("Elephant Thread Execution is done");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try{
            T1.display();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        th.getName();


    }
}

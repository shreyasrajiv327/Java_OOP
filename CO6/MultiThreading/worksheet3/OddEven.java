package worksheet3;
class generator{
    int Num ;
    generator(int n)
    {
      this.Num = n;
    }

    public synchronized void genOdd()
    {
        System.out.println("Odd Numbers!");
        for(int i =1 ; i<Num;i += 2)
        {
            System.out.println(i);
        }
    }

    public synchronized void genEven()
    {
        System.out.println("Even Numbers!");
        for(int i =0 ; i<Num;i += 2)
        {
            System.out.println(i);
        }
    }
}

class Student1 extends Thread{
    generator g;
    Student1(generator gen)
    {
        this.g = gen;
    }

    public void run()
    {
        g.genOdd();
    }

}

class Student2 extends Thread{
    generator g;
    Student2(generator gen)
    {
        this.g = gen;
    }
    public void run(){
        g.genOdd();
    }
}
public class OddEven {
    public static void main(String[] args) {
        generator gen1 = new generator(10);
        //generator gen2 = new generator(10);
        Student1 sa = new Student1(gen1);
        Student2 sb = new Student2(gen1);
        
        sa.start();
        sb.start();

    }
}

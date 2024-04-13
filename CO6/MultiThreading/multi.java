 class classB extends Thread{
    public void run()
    {
        System.out.println();
        for (int i = 1; i <= 5; i++)
    { 
    System.out.println(" Thread name = "+ Thread.currentThread().getName());
    } 
    }
}
public class multi {
    public static void main(String[] args) {
        classB t1 = new classB();
        t1.start();
        classB t2 = new classB();
        t2.start();
        classB t3 = new classB();
        t3.start();
    }
}

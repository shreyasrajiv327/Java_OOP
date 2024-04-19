class Multi extends Thread{
    public void run()
    {
        System.out.println("Shreyas R");
    }
}
public class thread1{
public static void main(String[] args) {
    Multi T1 = new Multi();
    T1.start();
}
}
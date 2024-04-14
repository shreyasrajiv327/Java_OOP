class Odd extends Thread{
    public void run(){
        System.out.println("Odd Numbers");
        for(int i=1;i<=10;i+=2){
          System.out.println(i);
        }
    }
}

class Even extends Thread{
    public void run(){
        System.out.println("EvenNumbers");
        for(int i=0;i<=10;i+=2){
          System.out.println(i);
        }
    }
}


public class EvenOdd{
    public static void main(String[] args) {
        Even t1 = new Even();
        t1.start();

        try{
            t1.join();
            System.out.println("Execution of T1 is completed");
        }catch(Exception e){
            System.out.println(e);
        }

        Odd t2 = new Odd();
        t2.start();
    }
}
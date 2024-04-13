class A{
    void display(){
        System.out.println("Hi im shreyas");
    }
}

class B extends  A{
    void college(){
        System.out.println("I go to RV University");
    }
}


class C extends B{
    void course(){
        System.out.println("Im pursuining BTech in CSE");
    }
}
public class Inhert {

    public static void main(String[] args) {
        C ob1 = new C();
        ob1.display();
        ob1.college();
        ob1.course();
    }
}
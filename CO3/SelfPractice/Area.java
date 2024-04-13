abstract class Shape{
    abstract double calculateArea();
}

class Rectangle extends Shape{
    public double length;
    public double height;
    public Rectangle(double l,double h)
    {
        this.length = l;
        this.height = h;
        
    }

    public double calculateArea()
    {
        return length*height;
    }
}

class circle extends Shape{
    public double radius;
    public double PI = 3.14;
    public circle(double r)
    {
        this.radius = r;
    }

    public double calculateArea()
    {
        return PI*radius*radius;
    }
}
public class Area {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 10);
        double area = r1.calculateArea();
        System.out.println("Area of the rectange is :" + area);
        circle c1 = new circle(10);
        area = c1.calculateArea();
        System.out.println("Area of the circle is :" + area);
        
    }
}

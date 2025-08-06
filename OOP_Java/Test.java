abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape{
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
class Square extends Shape{
    private double side;

    Square(double side){
        this.side=side;
    }
    @Override
    double calculateArea() {
        return side*side;
    }
}
public class Test{
    public static void main(String[] args) {
        Circle c=new Circle(10);
        Square s=new Square(10);
        System.out.println(c.calculateArea());
        System.out.println(s.calculateArea());
    }
}
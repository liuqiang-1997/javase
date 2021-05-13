package statics;

public class CircleTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4.99);

        System.out.println("circle id:"+circle.getId());
        System.out.println("circle1 id:"+circle1.getId());
        System.out.println("circle2 id:"+circle2.getId());
        System.out.println("Circle对象数："+Circle.getTotal());
    }
}
class Circle{
    private double radius;
    private int id;
    private static int total;
    private static int init = 10011;  // 公用的初始id被所有对象共享

    public Circle() {
        id = init++;
        total++;
    }
    public Circle(double radius){
        this();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }

    public static int getInit() {
        return init;
    }

    public static void setInit(int init) {
        Circle.init = init;
    }

    public double findArea() {
        return 3.14*radius*radius;
    }
}
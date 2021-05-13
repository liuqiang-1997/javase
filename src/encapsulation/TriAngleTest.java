package encapsulation;
/**
 * 编写TriAngle与TriAngleTest类，TriAngle类中声明私有的底边长base和高height，
 * 同时声明公共方法访问私有变量，此外，提供类必要的构造器，另一个类中使用这些公共方法计算三角形面积
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle(9.254,7);
        double area = triAngle.area();
        System.out.println(area);
    }
}

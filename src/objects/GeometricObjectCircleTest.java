package objects;

/**
 * GeometricObject类与Circle类的测试：
 * 创建两个Ciecle对象，判断其颜色是否相等；
 * 利用equals方法判断其半径是否相等；
 * 利用toString方法输出其半径
 */
public class GeometricObjectCircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle("read",3,2.9);
        Circle circle1 = new Circle("blue",3,2);
        System.out.println("颜色是否相等"+circle.color.equals(circle1.color));
        System.out.println("半径是否相等"+circle.equals(circle1));
        System.out.println("圆的半径"+circle.toString());
        System.out.println("圆的半径"+circle1.toString());
    }
}

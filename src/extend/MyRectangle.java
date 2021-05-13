package extend;

/**
 * 定义三个类，父类GeometricObject代表几何形状，子类Circles代表圆形，MyRectangle代表矩形。
 * 定义一个测试类GeometricTest，编写equalsArea方法测试两个对象的面积是否相等（注意方法的参
 * 数类型，利用动态绑定技术），编写displayGeometricObject方法显示对象的面积（注意方法的参
 * 数类型，利用动态绑定技术）。
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
            return height*width;
    }
}

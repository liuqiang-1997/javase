package extend;

/**
 * 定义三个类，父类GeometricObject代表几何形状，子类Circles代表圆形，MyRectangle代表矩形。
 * 定义一个测试类GeometricTest，编写equalsArea方法测试两个对象的面积是否相等（注意方法的参
 * 数类型，利用动态绑定技术），编写displayGeometricObject方法显示对象的面积（注意方法的参
 * 数类型，利用动态绑定技术）。
 */
public class Circles extends GeometricObject {
    private double radius;

    public Circles(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }

    public boolean equalArea(GeometricObject geometricObject){
        boolean flag = true;
        if (findArea()==geometricObject.findArea()){
            return flag;
        }else{
            flag = false;
        }
        return flag;
    }
}

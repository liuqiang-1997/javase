package extend;

/**
 * 定义三个类，父类GeometricObject代表几何形状，子类Circles代表圆形，MyRectangle代表矩形。
 * 定义一个测试类GeometricTest，编写equalsArea方法测试两个对象的面积是否相等（注意方法的参
 * 数类型，利用动态绑定技术），编写displayGeometricObject方法显示对象的面积（注意方法的参
 * 数类型，利用动态绑定技术）。
 */
public class GeometericTest {
    public static void main(String[] args) {
        GeometericTest geometericTest = new GeometericTest();
        Circles circles = new Circles("blue",1,1);
         MyRectangle myRectangle = new MyRectangle("read",1,Math.PI,1);

        geometericTest.displayGeometricObject(circles);
        geometericTest.displayGeometricObject(myRectangle);
//        boolean a = geometericTest.equalsArea(circles,myRectangle);
        boolean b = geometericTest.equalsArea(circles, myRectangle);
        if(b){
            System.out.println("两者面积相等");
        }else{
            System.out.println("两者面积不相等");
        }

    }

    public boolean equalsArea(GeometricObject g1, GeometricObject g2){
//        if(g1.findArea()== g2.findArea()){
//            return true;
//        }else{
//            return false;
//        }
        return g1.equalArea(g2);
    }

    public void displayGeometricObject(GeometricObject g1){
        System.out.println(g1.getColor()+"色图形面积为："+g1.findArea());

    }

}

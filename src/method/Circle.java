package method;

/**
 * 定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积
 * 定义一个PassObject类，在类中定义一个方法printAreas()，打印输出1-time之间每个整数半径值以及对应圆的面积
 */
public class Circle {

        double redius;

        public double findArea(){
            return Math.PI * redius*redius;
        }
    }




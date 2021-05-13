package method;
/**
 * 定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积
 * 定义一个PassObject类，在类中定义一个方法printAreas()，打印输出1-time之间每个整数半径值以及对应圆的面积
 */
public class PassObject{
    public static void main(String[] args) {

//        PassObject passObject = new PassObject();
//        passObject.printAreas(new Circle(),5);
    }

    public void printAreas(Circle circle,int time){
        System.out.println("Radius\t\t\tArea");
        for (int i = 1; i <= time; i++) {
            circle.redius = i;
            System.out.println(circle.redius+"\t\t\t"+circle.findArea());
        }


    }
}

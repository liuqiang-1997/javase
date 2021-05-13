package interfaces;

/**
 * 接口的使用
 * 1。 接口使用interface来定义
 * 2。在java中，类和接口是并列结构
 * 3。如何定义接口：定义接口中的成员
 *    3.1：JDK7及以前：只能定义全局常量和抽象方法
 *                   全局常量：(public static final) 类型 常量名；(可省略)
 *                   抽象方法：(public abstract) 返回类型 方法名；(可省略）
 *    3.2:JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法
 *
 * 4。接口中不能定义构造器，意味着接口不能实例化
 * 5。java开发中，接口通过让类去实现
 *             如果实现类实现了接口中的所有抽象方法，则此实现类就可以实例化
 *             如果实现类没有实现接口中的所有抽象方法，则此类还是一个抽象类（需要在类的定义上声明为abstract）
 *
 * 6。接口可以多实现多个接口
 *      class 类名 implements 接口一,接口二...{}
 *      class 类名 extends 父类名 implements 接口一,接口二...{}
 *
 * 7。接口之间可以多继承
 *
 * #############################################################
 *
 * 3.2:JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法(可以直接用对象调用，不用重写）
 *           1。接口中定义的静态方法只能通过 接口.静态方法名 的方式调用，不能通过实现类或实现类对象调用
 *           2。可以通过实现类的对象来调用接口中的默认方法，对象.默认方法名 ；但不能通过实现类来调用
 *           3。如果实现类重写了接口中的默认方法，调用时则调用的是重写后的方法
 *           4。如果子类(或实现类) 继承的父类和实现的接口中声明了同名同参数的默认方法，那么子类在没有重写此方法的前提下，
 *              默认调用父类中的同名同参数方法
 *           5。如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法，那么子类在没有重写此方法的前提下，
 *              编译器会报错接口冲突（避免接口冲突就必须要在实现类重写方法）
 *           6。如果实现类继承的父类并且实现了多个接口，在自己的方法体中调用父类，接口中被重写的方法：
 *                 调用自己定义的重写的方法：直接方法名
 *                 调用父类中生命的方法：super.方法名
 *                 调用接口中的默认方法：接口名.super.方法名
 *
 *
 */
public class InterfaceTest {
    public static void main(String[] args) {
        int maxSpeed = Flyable.MAX_SPEED;

       Plane plane = new Plane();
       plane.fly();
       plane.stop();

       Bullet bullet = new Bullet();
    }
}

interface Flyable{

    // 全局常量
    public static final int MAX_SPEED = 7900;  // 第一宇宙速度
    int MIN = 1;

    // 抽象方法
    public abstract void fly();
    void stop();  // 省略public abstract
}

interface Attackable{
    void attack();
}

/**
 * 如果实现类实现了接口中的所有抽象方法
 */
class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("飞机可以飞");
    }

    @Override
    public void stop() {
        System.out.println("飞机人为停止");
    }
}

/**
 * 如果实现类没有实现接口中的所有抽象方法
 */
abstract class Kite implements Flyable{

    @Override
    public void fly() {
        System.out.println("风筝可以飞");
    }

}

/**
 * 实现多个接口
 */
class Bullet implements Flyable,Attackable,CC{

    @Override
    public void fly() {
        System.out.println("子弹可以飞");
    }

    @Override
    public void stop() {
        System.out.println("子弹没动力停止");
    }

    @Override
    public void attack() {
        System.out.println("子弹有攻击性");
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

/**
 * 接口之间的多继承
 */
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{

}

/**
 #############################################################
 *
 * 3.2:JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法
 **/
interface CompareA{
    public static void method1(){
        System.out.println("静态方法");
    }

    static void method11(){
        System.out.println("静态方法省略public");
    }

    public default void method2(){
        System.out.println("默认方法");
    }

    default void method22(){
        System.out.println("默认方法省略public");
    }
}
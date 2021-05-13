package abstracts;

/**
 * abstract 关键字可用来修饰：类，方法
 *
 * abstract 修饰类：抽象类（ public abstract class 类名(); ）
 *         抽象类不能被实例化
 *         抽象类中一定有构造器，便于子类实例化时调用(涉及到子类对象的实例化全过程，调用父类的构造器)
 *         开发中都会提供抽象类的子类，让子类实例化对象完成相关的操作
 *
 * abstract 修饰方法：抽象方法（ 权限修饰符 abstract 方法返回值类型 方法名(); ）
 *        抽象方法只有方法的声明，没有方法体
 *        包含抽象方法的类一定是个抽象类；反之，抽象类中可以没有抽象方法
 *        若子类重写了父类中的所有抽象方法之后，此子类方可实例化；否则，此子类一定是个抽象类，需要abstract修饰
 *
 * abstract 使用上的注意点：
 *        不能用来修饰：属性，构造器等结构
 *        不能用来修饰：私有方法，静态方法，final的方法
 *
 *
 *
 *
 */

public class AbstractTest {
    public static void main(String[] args) {
        // 抽象类的匿名子类
        Employee e = new Employee(){
            @Override
            public void work() {

            }
        };
        e.work();
    }
}



















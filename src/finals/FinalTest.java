package finals;

import java.util.Arrays;

/**
 * final可以用来修饰：类；方法；变量
 *
 * final修饰一个类：此类不能被其他类继承
 *
 * final修饰一个方法：表明此方法不能被重写
 *
 * final修饰变量：此时的变量就称之为常量
 *      final修饰属性：可以考虑赋值的位置有：显示初始化，代码块中初始化，构造器中初始化
 *      final修饰局部变量：
 *                尤其修饰形参时，表明此形参是一个常量，但我们调用此方法时，给常量形参赋值一个实参；
 *                一旦给该常量形参赋值以后，就只能使用该形参，不能对其重新赋值
 *
 *  static final 只可以用来修饰属性，方法
 *      修饰属性：全局常量
 *      修饰方法：不能被重写的类方法
 */

public class FinalTest {
    final int WIDTH = 0;
    final int LEFT;
    final int RIGHT;
    {
        LEFT = 0;
    }

    public FinalTest() {
        RIGHT = 1;
    }

    public FinalTest(int n) {
        this();
    }

    public static void main(String[] args) {

    }
}

package overload;

/**
 * 1.编写程序，定义三个重载方法并调用，方法名为mOL
 *  三个方法分别接受一个int，两个int，一个字符串，
 *  分别执行平方运算并输出结果，相乘并输出结果，输出字符串
 *  在主类的main（）方法中分别用参数区别调用三个方法
 *
 * 2.定义三个重载方法max（）
 * 第一个求两个int值中最大值
 * 第二个求两个double值中最大值
 * 第三个求三个double值中最大值
 * 分别调用
 */

public class OverLoadTest {
    public static void main(String[] args) {
//        OverLoadTest overLoadTest = new OverLoadTest();
//        overLoadTest.max(1,2);
//        overLoadTest.max(1.2,2.1);
//        overLoadTest.max(1.0,2.0,3.0);
//        overLoadTest.mOL(3);
//        overLoadTest.mOL("hello java");
//        overLoadTest.mOL(2,3);
    }

    public void mOL(int i){
        System.out.println(i*i);
    }
    public void mOL(int a,int b){
        System.out.println(a*b);
    }
    public void mOL(String str){
        System.out.println(str);
    }
    public void max(int a,int b){
        System.out.println((a>b)?a:b);
    }
    public void max(double a,double b){
        System.out.println((a>b)?a:b);
    }
    public void max(double a, double b,double c){
        System.out.println((a>b)?a:((b>c)?b:c));
    }
}

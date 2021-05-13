package objects;

import org.junit.Test;

/**
 * 包装类的使用"、：基本数据类型，包装类，String之三者间的相互转换
 */
public class WrapperTest {
    int num1 = 10;
    float num2 = 12.765F;
    boolean isTrue;
    Boolean isMale;

    @Test
    public void test3(){
        // 自动装箱：基本数据类型 -》包装类
        int num1 = 19;
        Integer num2 = num1;
        Integer num3 = 19;

        // 自动拆箱：包装类 -》基本数据类型
        int num4 = num2;


    }
    /**
     * 包装类 -> 基本数据类型  (调用包装类的xxxValue()）
     */
    @Test
    public void test2(){
        Integer i = new Integer("145");
        int i1 = i.intValue();
        System.out.println(i1 );


    }
    /**
     * 基本数据类型 -> 包装类 (调用包装类的构造器）
     */
    @Test
    public void test1(){

//        System.out.println(num1.toString());  //erro
        Integer integer = new Integer(num1);
        System.out.println(integer.toString());
        Float f =  new Float(num2);
        WrapperTest wrapperTest = new WrapperTest();
        System.out.println(wrapperTest.isMale);  // null
        System.out.println(wrapperTest.isTrue);  // false
    }
}

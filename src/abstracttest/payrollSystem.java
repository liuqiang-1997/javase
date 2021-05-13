package abstracttest;

import java.util.Scanner;

/**
 *  * 5。定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用，
 *  *    利用循环结构遍历数组元素，输出各个对象的类型，name，number，birthday以及该对象生日；
 *  *    当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息
 */
public class payrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        Employee[] employee = new Employee[6];
        employee[0] = new SalariedEmployee("阿斯顿",10011,new MyDate(1997,8,29),1000);
        employee[1] = new SalariedEmployee("杜富国",10022,new MyDate(1994,6,8),650);
        employee[2] = new HourlyEmployee("周星驰",10033,new MyDate(1966,10,11),3.5,10);
        employee[3] = new SalariedEmployee("羊驼绒",10044,new MyDate(1989,3,29),997);
        employee[4] = new HourlyEmployee("沈德符",10055,new MyDate(1996,12,11),4,3);
        employee[5] = new HourlyEmployee("付国豪",10022,new MyDate(1988,8,11),70,2);

        for (int i = 0; i < employee.length; i++) {
            String s = employee[i].toString();
            System.out.println(s);
            double earnings = employee[i].earnings();
            System.out.println("月薪："+earnings);
            if(month == employee[i].getBirthday().getMonth()){
                System.out.println("生日快乐");
                earnings += 100;
                System.out.println("给你提供100元生日补贴，当前月薪为："+earnings+"元");
            }
        }


    }
}

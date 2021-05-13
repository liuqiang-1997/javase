package objects;

import java.util.Scanner;
import java.util.Vector;

/**
 * 利用Vector代替数组处理：
 * 从键盘读取学生成绩，以负数结束，找出最高分，并输出学生成绩等级
 *
 */
public class Wrappers {

    public static void main(String[] args) {
        Wrappers wrappers = new Wrappers();
        wrappers.getScore();
    }

    public void getScore(){
        Vector vector = new Vector();
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (;;){
            System.out.println("请输入学生成绩");
            Integer integer = scanner.nextInt();
            if (integer <0){
                break;
            }
            if (integer>max){
                max = integer;
            }
            vector.addElement(integer);
        }
        System.out.println("输入结束");
        for (int i = 0; i < vector.size(); i++) {
            Object obj = vector.elementAt(i);

            if(max-Integer.parseInt(obj.toString())<=10){
                System.out.println("A等："+Integer.parseInt(obj.toString()));

            }else if(max-Integer.parseInt(obj.toString())<=20){
                System.out.println("B等："+Integer.parseInt(obj.toString()));

            }else if(max-Integer.parseInt(obj.toString())<=30) {
                System.out.println("C等：" + Integer.parseInt(obj.toString()));

            }else{
                System.out.println("D等："+Integer.parseInt(obj.toString()));
            }

        }
        System.out.println("max:"+max);
    }


}


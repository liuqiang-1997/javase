package project1;

import java.util.Scanner;

/**
 * 项目一的工具类
 */

public class Utility {
    private static Scanner scanner = new Scanner(System.in);
    /**
     * 读取界面菜单输入
     */
    public static int readMenuSelection(){
        int w;
        for(;;){
            int str = scanner.nextInt();
            w = str;
            if(w!=3 && w!=1 && w!=2 && w!=4){
                System.out.println("place enter again");
            }else break;
        }
        return w;
    }

    /**
     * 收入支出金额的输入，获取键盘输入值
     */
    public static int readenternumber(){
        int num;
        for(;;){
            String str = scanner.next();
            try {
                num = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("erro! place enter again");
            }
        }
        return num;
    }

    /**
     * 收入支出说明，获取键盘输入值
     */
    public static String readString(){
      String str1 = scanner.next();
      return str1;
    }

    /**
     * 确认选择的输入y/n
     */
    public static String readConfirmSelection(){
        String s;
        for (;;){
            String str = scanner.next();
            s = str;
//            System.out.println(s);
            if(s.equals("y")||s.equals("n")){
                break;
            }else{
                System.out.println("place enter again!");
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String e = readConfirmSelection();
        System.out.println(e);
    }
}

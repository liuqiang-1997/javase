package project2;

import java.util.Scanner;

/**
 * 工具类，将不同的功能封装为方法
 */
public class CMUtility {
    private static Scanner scanner = new Scanner(System.in);

    /**
     *
     * @param limit
     * @param blankReturn
     * @return
     */
    private static String readKeyBoard(int limit,boolean blankReturn){
        String line = "";
        while(scanner.hasNext()){
            line = scanner.nextLine();
            if(line.length() ==0){
                if(blankReturn) return line;
                else continue;
            }
            if (line.length() <1 ||line.length()>limit){
                System.out.println("输入长度(不大于"+limit+"）错误，请重新输入");
                continue;
            }
            break;
        }
        return line;
    }

    /**
     * 界面菜单的选择，获取键盘输入
     * 1-5中的任意字符
     * @return 用户的操作对应字符
     */
    public static char readMenuSelection(){

        char c;
        for(;;){
            String str = readKeyBoard(1,false);
            c = str.charAt(0);
            if (c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5'){
                System.out.println("选择错误，请输入提示选项");
            }else break;
        }
        return c;
    }

    /**
     * 从键盘读取一个字符
     * @return 读取的字符
     */
    public static char readChar(){
        String str = readKeyBoard(1,false);
        return str.charAt(0);
    }

    /**
     * 长键盘读取字符作为返回值（修改）
     * 如果用户不输入字符而直接回车，则返回defaultValue
     * @param defaultValue 默认值
     * @return 读取字符
     */
    public static char readChar(char defaultValue){
        String str = readKeyBoard(1,false);
        return (str.equals("1"))?defaultValue:str.charAt(0);
    }

    /**
     * 读取一个不超过两位的整数
     * @return 读取的整数
     */
    public static int readInt(){
        int i;
        for (;;){
        String num = readKeyBoard(2,false);
        try {
            i= Integer.parseInt(num);
            break;
        } catch (NumberFormatException e) {
            System.out.println("输入错误，请重新输入");
        }
        }
        return i;
    }

    /**
     * 长键盘读取不超过两位的整数作为返回值（修改）
     * 如果用户不输入字符而直接回车，则返回defaultValue
     * @param defaultValue 默认值
     * @return 读取字符
     */
    public static int readInt(int defaultValue){
        int n;
        for (;;){
            String str = readKeyBoard(2,false) ;
            if (str.equals("1")){
                return defaultValue;
            }
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入错误，请重新输入");
            }
        }
        return n;
    }

    /**
     * 读取长度不超过limit的字符串
     * @return 返回该字符串
     */
    public static String readString(int limit){
        String str = readKeyBoard(limit,false);
        return str;
    }

    /**
     * 读取长度不超过limit的字符串（修改）
     * 如果用户不输入字符而直接回车，则返回defaultValue
     * @param defaultValue 默认值
     * @return 读取字符
     */
    public static String readString(int limit,String defaultValue){
        String str = readKeyBoard(limit,false);
        return (str.equals("1"))?defaultValue:str;
    }

    /**
     * 是否确认操作
     * @return Y or N
     */
    public static char reaEnter(){
        char c;
        for(;;) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if(c =='Y'||c =='N'){
                break;
            }else {
                System.out.println("请输入提示信息符");
            }
        }
        return c;
    }

}

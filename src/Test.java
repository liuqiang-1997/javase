import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//    boolean x = true;
//    boolean y = false;
//    short z = 42;
//    if((z++==42)&&(y=true))z++;
//    if((x=false) || (++z==45))z++;
//        System.out.println(z);
//
//        int num1 = 26;
//        int num2 = 12;
//        int num3 = 5;
//        int max = (num1>num2)?num1:((num2>num3)?num2:num3);
//        System.out.println(max);
//
//        double num1 = 11.0;
//        double num2 = 14.9;
//        if(num1>10.0 && num2<20.0){
//            System.out.println(num1+num2);
//        }else {
//            System.out.println(num1*num2);
//        }
//
//          int num1 = 23;
//          int num2 =45;
//          int item ;
//          item = num1;
//          num1 = num2;
//          num2 = item;
//          System.out.println(num1+"num2:" + num2);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("place enter your string:");
//        String name = scanner.next();
//        System.out.println("place enter your int:");
//        int age = scanner.nextInt();
//        System.out.println("place enter your double:");
//        double weight = scanner.nextDouble();
//        System.out.println("you name and age is : " + name + "and" + age + weight);
//        boolean bool = scanner.nextBoolean();
//        System.out.println(bool);
//        char chaename = name.charAt(0);
//        System.out.println(chaename);

//        Scanner scanner = new Scanner(System.in);
//        int score = scanner.nextInt();
//        if(score == 100){
//            System.out.println("bmw");
//        }else if(score>80 && score<=90){
//            System.out.println("iphone");
//        }else if (score>=60&&score<=80){
//            System.out.println("ipad");
//        }else{
//            System.out.println("null");
//        }
//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        if (num1 > num2) {
//            if (num3 > num1) {
//                System.out.println("" + num2 + "" + num1 + "" + num3);
//            }
//        } else {
//            if (num3 > num2) {
//                System.out.println("" + num1 + "" + num2 + "" + num3);
//            }
//
//        }
//        int a = 10;
//        int b = 30;
//        if (a+b >= 50){
//            System.out.println("hello world");
//        }else{
//            System.out.println("啥也不是");
//        }

//        double a = 10.78;
//        double b = 34.76;
//        if (a>10.0 && b <20.0){
//            System.out.println(a+b);
//        }else{
//            System.out.println(a*b);
//        }

//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        if (age<0){
//            System.out.println("提示信息");
//        }else if(age>2){
//            System.out.println((2*10.5)+((age-2)*4));
//        }else{
//            System.out.println(age*10.5);
//        }

//        /*
//        获取随机数公式： [a,b]  -->  (int)(Math.random() * (b - a + 1)) +a
//         */
//        int value = (int)(Math.random()*90+10);
//        System.out.println(value);

//        // 使用switch把小写的字符转换为大写
//        Scanner scanner = new Scanner(System.in);
//        String c = scanner.next();
//        char ch = c.charAt(0);
//        switch (ch){
//            case 'a':
//                System.out.println("A");
//                break;
//            case 'b':
//                System.out.println("B");
//                break;
//            case 'c':
//                System.out.println("C");
//                break;
//            case 'd':
//                System.out.println("D");
//                break;
//            default:
//                System.out.println("author");

//        }


//        int score = 1;
//        switch (score){
//            case 1:
//            case 2:
//            case 12:
//                System.out.println("dong");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("spring");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("qiu");
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("summer");
//
//        }

//
//        // 给出月日时间推算当年天数
//        Scanner scanner = new Scanner(System.in);
//        int month = scanner.nextInt();
//        int day = scanner.nextInt();
//        int sumDays = 0;
//        switch (month){
//            case 12:
//                sumDays += 30;
//            case 11:
//                sumDays += 31;
//            case 10:
//                sumDays += 30;
//            case 9:
//                sumDays += 31;
//            case 8:
//                sumDays += 31;
//            case 7:
//                sumDays += 30;
//            case 6:
//                sumDays += 31;
//            case 5:
//                sumDays += 30;
//            case 4:
//                sumDays += 31;
//            case 3:
//                  if(){// 判断闰年
////                    sumDays += 28;
//                   }else {
//                      sumDays += 29;
//                  }
//            case 2:
//                sumDays += 31;
//            case 1:
//                sumDays += day;
//                System.out.println(month+"月"+day+"日是2019年的第"+sumDays+"天");
//
//
//        }


//        for (int i = 1;i<=150;i++){

//            if(i%3==0 && i%5==0 && i%7==0) {
//                System.out.println(i + " foo " + " biz " + " baz ");
//            }else if(i%3==0){
//                System.out.println(i+" foo");
//            }else if(i%5==0){
//                System.out.println(i+" biz");
//            }else if(i%7==0) {
//                System.out.println(i + " baz");
//            }else{
//                System.out.println(i);
//            }
//            System.out.print(i+"");
//            if(i%3==0){
//                System.out.print(" foo");
//            }
//            if(i%5==0){
//                System.out.print(" biz");
//            }
//            if(i%7==0) {
//                System.out.print(" baz");
//            }
//            System.out.println();
//        }


//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        Integer ints = scanner.nextInt();
//        System.out.println(str+"=="+ints);
//        int count = 0;
//
//        for(int i = 1; i <= 100;i++){
//            if(i%2 != 0){
//                System.out.println(i);
//                count += i;
//            }
//        }
//        System.out.println(count);

//    // 求最大公约数最小公倍数
//    Scanner scanner = new Scanner(System.in);
//    int num1 = scanner.nextInt();
//    int num2 = scanner.nextInt();
//    int min = (num1>=num2)?num2:num1;
//    for (int i = min;i>=1;i--){
//        if(num1%i ==0 && num2%i ==0 ){
//            System.out.println(i);
//            break;
//        }
//    }
//    int max = (num1>=num2)?num1:num2;
//    for (int i = max;i<=num1*num2;i++){
//        if (i%num1 ==0 && i%num2==0){
//            System.out.println(i);
//            break;
//        }
//    }

//
//        // 从键盘读入个数不确定的整数，判断其中正负数的个数，遇到0停止程序
//        boolean flag = true;
//        int count = 0;
//        int count1 = 0;
//        Scanner scanner = new Scanner(System.in);
//        while (flag){// for(;;){ 等价于while(true)
//
//            int num = scanner.nextInt();
//            if(num >0){
//                count+=1;
//            }else if(num <0){
//                count1 +=1;
//            }else {
//                flag = false;
////                break;
//            }
//
//        }
//         System.out.println("+"+count+"-"+count1);

//        for (int i = 1;i<=6;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1;i<=6;i++){
//            for(int j = 1;j<=6-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i = 1;i<=9;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("  "+i+"*"+j+"="+i*j);
//            }
//            System.out.println();
//        }

//        // 带标签的break和continue
//        label: for (int i = 1; i < 4; i++) {
//            for (int j = 1; j < 10; j++) {
//                if (j % 4 == 0) {
//                    System.out.println("i"+i);
////                    break label;
////                    continue label;
////                    break ;
//                    continue ;
//                }
//                System.out.print("j"+j);
//            }
//            System.out.println("wai");
//        }
//        // 一位数组
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入人数");
//        int number = scanner.nextInt();
//        int[] arry = new int[number];
//        int max = 0;
//        System.out.println("请输入"+number+"个成绩");
//        for (int i = 0; i < arry.length; i++) {
//            int score = scanner.nextInt();
//            arry[i] = score;
//            if(max<arry[i]){
//                max = arry[i];
//            }
//        }
//        for (int i = 0;i<arry.length;i++){
//            if (arry[i]>=max-10){
//                System.out.println(i+"号同学的成绩为"+arry[i]+"；等级为A");
//            }else if (arry[i]>=max-20){
//                System.out.println(i+"号同学的成绩为"+arry[i]+"；等级为B");
//            }else if (arry[i]>=max-30){
//                System.out.println(i+"号同学的成绩为"+arry[i]+"；等级为c");
//            }else {
//                System.out.println(i+"号同学的成绩为"+arry[i]+"；等级为D");
//            }
//
//        }
//        System.out.println("最高分："+max+"分");

//        int arry[][] = new int[][]{{3,5,8,},{12,9},{7,0,6,4}};
//        for(int i = 0;i<arry.length;i++){
//            for(int j=0;j<arry[i].length;j++){
//                System.out.print(arry[i][j]+"  ");
//            }
//            System.out.println();
//        }

//

//        int[] arr = new int[10];
//        System.out.println(arr);
//
//        char[] arr1 = new char[]{'1','4','3'};
//        System.out.println(arr1);




    }

}




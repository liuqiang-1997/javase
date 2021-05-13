package method;

public class Person {

    /**
     * 练习一
     */
//        Person p = new Person();
////        p.Methods();
////        int a = p.Methods();
////        System.out.println(a);
//        int a = p.Methods(4,6);
//        System.out.println(a);
//    }
//
//
////        public void Methods(){
////            for (int i = 0; i < 10; i++) {
////                for (int j = 0; j < 8; j++) {
////                    System.out.print("*");
////                }
////                System.out.println();
////            }
////        }
////    public int Methods(){
////        int arre = 0;
////        for (int i = 0; i < 10; i++) {
////            for (int j = 0; j < 8; j++) {
////                System.out.print("*");
////                arre = i*j;
////            }
////            System.out.println();
////
////        }
////        return arre;
////    }
//    public int Methods(int m, int n){
//        int arre = 0;
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        arre = m*n;
//        return arre;
//    }

    /**
     * 对象数组方式一
     * 学号1-20；年纪1-6；成绩0-100随机
     * 输出state=3的学号
     */
//    public static void main(String[] args) {
//        Student[] stu = new Student[20];
//        for (int i = 0; i < stu.length; i++) {
//           stu[i] = new Student();
//           stu[i].number =i;
//           stu[i].state = (int)(Math.random() *(6-1+1)+1);
//           stu[i].score = (int)(Math.random()*(100+1));
//        }
//        for (int i = 0; i < stu.length ; i++) {
//            System.out.println(" 年纪："+stu[i].state+" 学号："+stu[i].number+" 成绩："+stu[i].score);
//
//        }
//
//        for (int i = 0; i < stu.length; i++) {
//            if(stu[i].state == 3){
//                System.out.println(stu[i].state+"年级有："+stu[i].number);
//            }
//        }
//
//        for (int i = 0; i < stu.length-1; i++) {
//            for (int j = 0; j < stu.length-1-i; j++) {
//                 if(stu[j].score > stu[j+1].score){
//                     Student temp = stu[j];
//                     stu[j] = stu[j+1];
//                     stu[j+1] = temp;
//                 }
//            }
//        }
//        for (int i = 0; i < stu.length; i++) {
//            System.out.println(" 年纪："+stu[i].state+" 学号："+stu[i].number+" 成绩："+stu[i].score);
//
//        }
//
//    }
//}
//    class Student {
//        int number;
//        int state;
//        int score;
//
//        }

    /**
     * 对象数组方式二
     * 学号1-20；年纪1-6；成绩0-100随机
     * 输出state=3的学号
     */
//    public static void main(String[] args) {
//        Student1[] stu = new Student1[20];
//
//        Person person = new Person();
//        person.init(stu);
//        person.state(stu,6);
//        person.sort(stu);
//
//    }
//
//    /**
//     * 初始化对象数组
//     * 学号1-20；年纪1-6；成绩0-100随机
//     * @param stu Student1数组
//     */
//    public void init(Student1[] stu){
//        for (int i = 0; i < stu.length; i++) {
//            stu[i] = new Student1();
//            stu[i].number = i;
//            stu[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
//            stu[i].score = (int) (Math.random() * (100 + 1));
//        }
//    }
//
//    /**
//     * 查找相关年纪的学号
//     * @param s Student1 数组
//     * @param state int 年级（1-6）
//     */
//    public void state(Student1[] s,int state){
//        for (int i = 0; i < s.length; i++) {
//            if(s[i].state == state){
//                System.out.println(s[i].state+"年级有："+s[i].number);
//            }
//        }
//    }
//
//    /**
//     * 对成绩冒泡
//     * @param stu Student1 数组
//     *
//     */
//    public void sort(Student1[] stu){
//        for (int i = 0; i < stu.length-1; i++) {
//            for (int j = 0; j < stu.length-1-i; j++) {
//                 if(stu[j].score > stu[j+1].score){
//                     Student1 temp = stu[j];
//                     stu[j] = stu[j+1];
//                     stu[j+1] = temp;
//                 }
//            }
//        }
//        for (int i = 0; i < stu.length; i++) {
//            System.out.println(" 年纪："+stu[i].state+" 学号："+stu[i].number+" 成绩："+stu[i].score);
//
//        }
//    }
}
    class Student1 {
        int number;
        int state;
        int score;

    }

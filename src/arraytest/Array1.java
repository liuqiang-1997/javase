package arraytest;

/**
 * 关于数组的操作
 */
public class Array1 {
    public static void main(String[] args) {
        /**
         * 杨辉三角
         */

//        int[][] arry = new int[10][];
//        for(int i=0;i< arry.length;i++){
//            arry[i] = new int[i+1];
//            arry[i][0] = 1;
//            arry[i][i] = 1;
//            for (int j = 1; j < arry[i].length-1; j++) {
//                    arry[i][j] = arry[i-1][j-1]+arry[i-1][j];
//                }
//        }
//        for (int i = 0; i < arry.length; i++) {
//            for (int j = 0; j < arry[i].length; j++) {
//
//                System.out.print(arry[i][j]);
//            }
//            System.out.println();
//        }

        /**
         *  0-30之间随机数组
         */
//
//        int[] arry = new int[6];
//        for (int i = 0; i < arry.length; i++) {
//            arry[i] = (int) (Math.random()*30)+1;
//            for (int j = 0; j < i; j++) {
//                if(arry[i] == arry[j]){
//                    i--;
//                    break;
//                }
//            }
//        }
//        for (int i = 0; i < arry.length; i++) {
//            System.out.println(arry[i]);
//        }

        /**
         * // 求十个随机两位数【10-99】数中最大值，最小值，和，平均值
         */
//        int[] arry = new int[10];
//        int max = arry[0];
//        int sum = 0;
//        int avg = 0;
//        for (int i = 0; i < arry.length; i++) {
//            arry[i] = (int)(Math.random() * (99-10+1)+10);
//            System.out.println(arry[i]);
//            sum += arry[i];
//            avg = sum/10;
//        }
//        for (int i = 1; i < arry.length; i++) {
//                if(max<arry[i]){
//                    max = arry[i];
//                }
//        }
//        int min = arry[0];
//        for (int i = 1; i < arry.length; i++) {
//            if(min>arry[i]){
//                min = arry[i];
//            }
//        }
//        System.out.println(min+" "+max + " " + sum + " "+avg);

        /**
         * / 数组假复制
         */
//        int[] array1 = new int[]{2,3,5,7,11,13,17,19};
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println(array1[i]);
//        }
//        int[] array2 = array1;
//        for (int i = 0; i < array2.length; i++) {
//
//            if(i%2==0){
//                array2[i] = i;
//            }
//            System.out.print(array2[i]);
//        }
//        System.out.println();

      /**
       * //数组复制
       */
//        int[] array3 = new int[array2.length];
//        for (int i = 0; i < array2.length; i++) {
//            array3[i] = array2[i];
//            System.out.print(array3[i]);
//        }
//        System.out.println(array1+" "+array2+" "+array3);

        /**
         * 数组反转
         */

//        String[] arr = new String[]{"qwe","asd","dfg","wrt","fgh","yui","kbc"};
//        // 方法一：
//        for (int i = 0; i < arr.length/2; i++) {
//            String temp = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//        }
//        // 方法二：
//        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
//            String temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        /**
         * 线性查找
         */
//        String[] arrarStr = new String[]{"asd","wer","tyu","fgh","zxc","jkl"};
//        String dest = "fgh";
//        boolean flag = true;
//        for (int i = 0; i < arrarStr.length; i++) {
//            if(dest.equals(arrarStr[i])){
//                System.out.println("fount "+i);
//                flag = false;
//                break;
//            }
//        }
//        if (flag){
//            System.out.println("not fount");
//        }

        /**
         * 二分法查找：说要查找的数组必须有序
         */
//        int[] arrarStr = new int[]{-3,-2,-1,9,34,43,51,57,61,89};
//        int dest1 = 89;
//        int head = 0; // 初始的首索引
//        int end = arrarStr.length-1; // 初始的尾索引
//        boolean flag = true;
//        while (head <= end){
//            int middle = (head+end)/2;
//            if (dest1 == arrarStr[middle]){
//                System.out.println("fount  " + middle);
//                flag = false;
//                break;
//            }else if(arrarStr[middle] > dest1){
//                end = middle -1;
//            }else{
//                head = middle +1;
//            }
//        }
//        if (flag){
//            System.out.println("not fount");
//        }

        /**
         * 冒泡排序
         */

//        int[] arr = new int[]{12,45,8,-87,-3,-6,43,67,12,45};
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-1-i; j++) {
//                if (arr[j] > arr[j+1]){// 大到小
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        /**
         * 快速排序
         */























    }
}

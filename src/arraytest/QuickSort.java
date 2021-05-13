package arraytest;

import java.util.Arrays;

/**
 * 快速排序：
 */
public class QuickSort {
    private static void swap(int[] data,int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private  static  void  subSort(int[] data, int start, int end){
        if(start < end){
            int base = data[start];
            int low = start;
            int high = end + 1;
            while(true){
                while(low < end && data[++low] - base <= 0)
                    ;
                while (high > start && data[--high] - base >= 0)
                    ;
                if (low < high){
                    swap(data,low,high);
                }else{
                    break;
                }
            }
            swap(data, start, high);
            subSort(data, start, high -1 );// 递归调用
            subSort(data,high+1,end);
        }
    }
    public static void quickSort(int[] data){
        subSort(data,0,data.length-1);
    }

    public static void main(String[] args) {
        int[] data = {1,-4,-6,-43,0,12,45,5,424,5,74,32,3,5};
        System.out.println("排序前"+ Arrays.toString(data));
        quickSort(data);
        System.out.println("排序后"+Arrays.toString(data));
    }
}

package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,-6,0,1,9,13,43,25,12,31};
        int[] ans = Sort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Sort(int[] arr) {
//        for(int i = 0;i<arr.length-2;i++){
//            int min = i;
//            for(int j = i;j<arr.length-1;j++){
//                if(arr[j]<arr[min]) min = j;
//            }
//            swap(i,min,arr);
//        }
        for(int i = 0; i<arr.length ; i++){
            int last = arr.length-i-1;
            int max = getmaxidx(0,last,arr);

            swap(max,last,arr);
        }
        return arr;
    }
    static int getmaxidx(int start,int last,int[] arr){
        int max = start;
        for(int i = start+1 ;i<=last;i++){
            if(arr[i]>arr[max]) max = i;
        }
        return max;
    }
    static void swap(int i,int min ,int[]arr){
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

}
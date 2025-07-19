package Arrays;

import java.util.Arrays;

public class reversingArray {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,8,9,3,0};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr,int idx1 , int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

    }
}

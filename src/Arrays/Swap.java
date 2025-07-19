package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {4,6,2,10,9};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,3);
        System.out.println("After Swapped ->> "+Arrays.toString(arr));
    }
    static void swap(int[] arr,int idx1 , int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

    }
}

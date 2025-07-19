package Sorting;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {22,-12,0,56,76,5,4,8,9,6,2,13,66};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

}

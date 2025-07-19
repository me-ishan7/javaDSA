package Recursion;
import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,2,9};
        int i = 0;
        int j = arr.length-1;
        System.out.println(Arrays.toString(reverse(arr,i,j)));
    }
    static int[] reverse(int[] arr,int i ,int j){
       swap(arr,i,j);
       return arr;
    }
    static int[] swap(int[] arr ,int i, int j){
        if(i>=j) return arr;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return swap(arr,i+=1,j-=1);
    }
}

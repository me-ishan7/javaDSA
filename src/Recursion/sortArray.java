package Recursion;

public class sortArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {9,5,1,2,3};
        System.out.println("The array 1 is sorted ? --> "+isSorted(arr1 , 0));
        System.out.println("The array 2 is sorted ? --> "+isSorted(arr2 , 0));
    }
    static boolean isSorted(int[] arr , int idx){
        if(idx == arr.length - 1) return arr[idx-1] < arr[idx];
        return arr[idx] < arr[idx+1] && isSorted(arr , idx + 1);
    }
}

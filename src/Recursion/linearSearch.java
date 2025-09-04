package Recursion;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {2,43,21,5,56,41,96,9};
        System.out.println("Enter number to search : ");
        int target = new Scanner(System.in).nextInt();
        System.out.println(Search(arr, target));
    }
    static boolean Search(int[] arr, int target){
        int n = arr.length;
        return helper(arr,target,n-1);
    }
    static boolean helper(int[] arr, int target, int n){
        if(n == -1) return false;
        if(arr[n] == target) return true;
        return helper(arr,target,n-1);
    }
}

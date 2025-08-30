package Recursion;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,22,30,34,52,143};
        int target = 2;
        int s = 0 , e = arr.length-1;
        int idx = search(arr , target , s , e);
        System.out.println(idx);
    }
    static int search(int[] arr, int target, int s, int e){
        if(s > e) return -1; // base condition
        int m = s + (e - s) / 2;
        if (arr[m] == target) return m;
        else if(arr[m] > target){
            return search(arr, target, s, m-1);
        }
        else {
            return search(arr, target,m+1, e);
        }
    }
}

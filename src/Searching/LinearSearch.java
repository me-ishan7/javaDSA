package Searching;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 43, 53, 5, 6, 65, 74, 12, 34, 87, 9, 90, 100, 39, 69};
        System.out.println("Enter the Target");
        int n = sc.nextInt();
        System.out.println(search(n, arr));
    }

    public static int search(int n, int[] arr) {
        if(arr.length==0) return -1;
        for (int i  = 0;i<arr.length;i++) {
            if (arr[i] == n) return i;
        }
        return -1;
    }
}

package Strings;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String s = "Abcdef";
        int n = s.length();
        char[] arr = new char[n];

        arr = s.toCharArray();
        int left = 0 , right = n - 1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

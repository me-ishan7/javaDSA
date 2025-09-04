package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "eef";
        System.out.println( isPalindrome(s));

    }
    static boolean isPalindrome(String s){
        int n = s.length();
        int left = 0 , right = n - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}

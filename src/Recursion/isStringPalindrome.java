package Recursion;

public class isStringPalindrome {
    public static void main(String[] args) {
        String str = "11211";
        System.out.println(isStringPalindrome(str,0,str.length()-1));
    }
    static boolean isStringPalindrome(String str, int i , int j ){
        if(i>=j) return true;
        if(str.charAt(i) != str.charAt(j)) return false;
        return isStringPalindrome(str,i+1,j-1);
    }
}

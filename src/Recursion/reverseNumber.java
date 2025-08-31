package Recursion;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(4567,0));
    }
    static int reverse(int n, int rev){
        if(n == 0) return rev;
        return  reverse(n/10, rev * 10 + (n%10));
    }
}

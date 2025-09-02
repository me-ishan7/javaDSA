package Recursion;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
//        int ans = reverse(n ,0);
//        if(n == ans) {
//            System.out.println(ans + " is a palindrome number.");
//        }
//        else {
//            System.out.println(n + " is not a palindrome");
//        }
    }
    static boolean isPalindrome(int n){
        return (reverse(n,0) == n);
    }
    static int reverse(int n , int rev){
        if(n == 0) return rev;
        return reverse(n / 10 , rev * 10 + n % 10);
    }
}

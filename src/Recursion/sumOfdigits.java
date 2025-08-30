package Recursion;
import java.util.Scanner;
public class sumOfdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int ans = sumDigits(n);
        System.out.println("The sum of the digits is : " + ans);
    }
    static int sumDigits(int n){
        if(n == 0) return 0;
        return (n % 10) + sumDigits(n / 10 );
    }
}

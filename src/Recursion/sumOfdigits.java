package Recursion;
import java.util.Scanner;
public class sumOfdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int ans = sumDigits(n , 0);
        System.out.println("The sum of the digits is : " + ans);
    }
    static int sumDigits(int n , int sum){
        if(n == 0) return sum;
        sum = sum + n % 10;
        return sumDigits(n / 10 , sum);
    }
}

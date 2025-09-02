package Recursion;
import java.util.Scanner;
public class countZeroes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n = sc.nextInt();
        System.out.println(CountZeroes(n , 0));
    }
    static int CountZeroes(int n , int count){
        if(n == 0) return count;
        else if (n % 10 == 0) {
            count++;
        }
        return CountZeroes(n / 10 , count);
    }
}

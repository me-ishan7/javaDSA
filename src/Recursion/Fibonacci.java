package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth count of fibonacci series : ");
        int n = sc.nextInt();
        int ans = fibonacci(n);
        System.out.println("This is the nth fibonacci number :  " + ans);
    }
    public static int fibonacci(int n){
        if(n == 0 || n == 1) return n;

        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}

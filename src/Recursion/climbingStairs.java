package Recursion;

import java.util.Scanner;

public class climbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Stairs: ");
        int n =  sc.nextInt();
        int ans = noOfSteps(n);
        System.out.println("The no. of steps it will take is : "+ ans);
    }
    static int noOfSteps(int n) {
        if (n == 1 || n == 2) return n;
        return noOfSteps(n-1) + noOfSteps(n-2);
    }
}

package Recursion;
import java.util.Scanner;
import java.util.*;
public class cutSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values : ");
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int ans = maximiseTheCut(n,x,y,z);
        System.out.println("Maximum no. of segments is : "+ans);
    }
    static int maximiseTheCut(int n, int x, int y, int z) {
        if ( n == 0) return 0;
        if ( n < 0) return Integer.MIN_VALUE;
        int option1 = 1 + maximiseTheCut((n - x), x, y, z);
        int option2 = 1 + maximiseTheCut((n - y), x, y, z);
        int option3 = 1 + maximiseTheCut((n - z), x, y, z);

        return Math.max(option1 , Math.max(option2, option3));
    }
}

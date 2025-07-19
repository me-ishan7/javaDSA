package Recursion;
import java.util.Scanner;
public class print_nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        func(n);
    }
    static void func(int n){
        if (n<1) return;
        System.out.println(n);
        func(n-1);
    }
}

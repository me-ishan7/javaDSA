package Recursion;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class print_1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        func(1,n);
    }
    static void func(int i,int n){
        if(i>n) return;
        System.out.println(i);
        func(i+1,n);
    }
}

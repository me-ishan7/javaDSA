package Recursion;

public class backtrack_nto1 {
    public static void main(String[] args) {
        int n = 9;
        func(1,n);
    }
    static void func(int i , int n){
        if (i>n) return;
        func(i+1,n);
        System.out.println(i);
    }
}

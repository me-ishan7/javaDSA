package Recursion;

public class backtrack_1toN {
    public static void main(String[] args) {
        int n = 9;
        func(n,n);
        // This is the program to print linearly using backtracking
    }
    static void func(int i,int n){  //i = n  = 9
        if(i<1) return;
        func(i-1,n); //i will decrement by 1  untill base cond is met till then function will be called
        System.out.println(i);//at this moment base cond is met and the last func called will return and in previous
                              //function it will se the message to print i --> here i = 1 then again return as this fun
                              // is completed and as so on.
    }
}

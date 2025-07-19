package Recursion;
import java.util.Scanner;
public class sum_1st_N_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
//        int ans = sum(1,n,0);
//        System.out.println(ans);
        int ans = sum2(n, 0);
        System.out.println("The sum is " + ans);
    }
//    static int sum(int i,int n,int sum){
//        if(i>n) return sum;
//        return  sum(i+1,n,sum+i);
//}
static int sum2(int n,int sum){
        if(n<1) return sum;
        return sum2(n-1,sum+n);
    }

}

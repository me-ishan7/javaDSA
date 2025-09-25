package bitManipulation;
import java.util.Scanner;
public class countSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int ans = count(n);
        System.out.println("The set bits are: "+ ans);
    }
    static int count(int n) {
        int res = 0;
//        while (n > 0){
//            res = res + (n & 1);
//            n = n >> 1;
//        }

        // Brian Kerningam's Algo

        while( n > 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }
}

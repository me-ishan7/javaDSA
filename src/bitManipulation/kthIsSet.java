package bitManipulation;
import java.util.Scanner;
public class kthIsSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the kth bit : ");
        int k = sc.nextInt();
        System.out.println(isSet(n, k));
    }
    static boolean isSet(int n, int k) {
        int x = 1;
        if((n & x << (k-1)) != 0) return true;
        return false;
    }
}

package bitManipulation;
import java.util.Scanner;
public class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value : ");
        int n = sc.nextInt();

        if((n & (n - 1)) != 0){
            System.out.println("Not a Power of two.");
        }
        else {
            System.out.println("Power of two");
        }
    }
}

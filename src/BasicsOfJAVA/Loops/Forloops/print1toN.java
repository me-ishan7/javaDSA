package BasicsOfJAVA.Loops.Forloops;
import java.util.Scanner;
public class print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.println("The "+i+"th number is "+i);
        }
    }
}

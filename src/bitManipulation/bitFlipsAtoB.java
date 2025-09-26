package bitManipulation;
import java.util.Scanner;
public class bitFlipsAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int A = sc.nextInt();
        System.out.println("Enter Second number: ");
        int B = sc.nextInt();

        System.out.println(Flips(A, B));
    }

    static int Flips(int A, int B) {
        int count = 0;
        while (A > 0 || B > 0) {
            if ((A & 1) != (B & 1)) {
                count++;
            }
            A = A >> 1;
            B = B >> 1;
        }
        return count;
    }
}


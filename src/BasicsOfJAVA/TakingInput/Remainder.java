package BasicsOfJAVA.TakingInput;
import  java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = sc.nextInt();
        int rem = num1 - (num2 * (num1 / num2));// a = b*q + r
        System.out.println("The Remainder is : " + rem);
    }
}

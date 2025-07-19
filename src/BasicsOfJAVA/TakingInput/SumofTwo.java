package BasicsOfJAVA.TakingInput;
import java.util.Scanner;
public class SumofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a , b ;
        System.out.println("Enter the first number");
        a = sc.nextDouble();
        System.out.println("Enter the second number");
        b = sc.nextDouble();
        System.out.println("The Sum of the numbers is : "+(a+b));

        }
    }


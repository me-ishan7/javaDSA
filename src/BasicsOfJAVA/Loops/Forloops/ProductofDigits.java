package BasicsOfJAVA.Loops.Forloops;
import java.util.Scanner;
public class ProductofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int product = 1,digit;
        while(n!=0){
            digit = n%10;
            if(digit!=0){
                product = product * digit;
            }
            n/=10;
        }
        System.out.println(product);
    }
}

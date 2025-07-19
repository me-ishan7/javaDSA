package BasicsOfJAVA.TakingInput;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int square = num*num;
        System.out.println("The Square of the number  is : "+square);
    }

}

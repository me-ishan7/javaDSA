package BasicsOfJAVA.Conditionals;
import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Given number is Even");
        }
        else{
            System.out.println("Given number is Odd");
        }


    }
}

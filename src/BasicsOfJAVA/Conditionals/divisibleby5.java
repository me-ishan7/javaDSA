package BasicsOfJAVA.Conditionals;
import java.util.Scanner;
public class divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num%5==0){
            System.out.println("The Number is Divisible By 5");
        }
        else{
            System.out.println("The Number is not Divisible By 5");
        }
    }
}

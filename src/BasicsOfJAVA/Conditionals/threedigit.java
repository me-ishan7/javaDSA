package BasicsOfJAVA.Conditionals;
import java.util.Scanner;
public class threedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num > 99 && num < 1000){
            System.out.println("Number has three digits");
        }
        else{
            System.out.println("Number has not three digits");
        }
    }
}

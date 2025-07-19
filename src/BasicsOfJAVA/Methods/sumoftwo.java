package BasicsOfJAVA.Methods;
import java.util.Scanner;
public class sumoftwo {
    public static void main(String[] args) {
        sum();

    }
    static void sum()
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter the first number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);

    }
}

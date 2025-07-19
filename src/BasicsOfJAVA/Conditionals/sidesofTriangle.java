package BasicsOfJAVA.Conditionals;
import java.util.Scanner;
public class sidesofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third number : ");
        int c = sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("They are side of the triangle");
        }
        else{
            System.out.println("They are not side of the triangle");
        }

    }
}
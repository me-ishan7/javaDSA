package BasicsOfJAVA.Conditionals;
import java.sql.SQLOutput;
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if((num%4==0 && num%100!=0)||(num%400==0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}

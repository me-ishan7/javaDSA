package BasicsOfJAVA.Conditionals;
import java.sql.SQLOutput;
import java.util.Scanner;
public class threePointsOnLine {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1");
        int x1 = sc.nextInt();
        System.out.println("Enter x2");
        int x2 = sc.nextInt();
        System.out.println("Enter x3");
        int x3 = sc.nextInt();
        System.out.println("Enter y1");
        int y1 = sc.nextInt();
        System.out.println("Enter y2");
        int y2 = sc.nextInt();
        System.out.println("Enter y3");
        int y3 = sc.nextInt();
        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);
        if(m1 == m2){
            System.out.println("Lies on Straight line");
        }
        else{
            System.out.println("Do not lie on Straight line");
        }
    }
}

package BasicsOfJAVA.Pattern;
import java.util.Scanner;
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int a = 1;
        for(int r = 1; r<=rows;r++){
            for(int c = 1;c<=r;c++){
                System.out.print(a+" ");
                a+=1;
            }
            System.out.println();
        }

    }
}

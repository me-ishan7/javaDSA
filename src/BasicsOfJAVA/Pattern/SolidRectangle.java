package BasicsOfJAVA.Pattern;
import java.util.Scanner;
public class SolidRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Rows and columns of the Rectangle");
        int rows = input.nextInt();
        int columns = input.nextInt();
        for(int r=1;r<=rows;r++){
            for(int c=1;c<=columns;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



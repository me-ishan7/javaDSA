package BasicsOfJAVA.Pattern;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int rows =  sc.nextInt();
        int columns =  sc.nextInt();
        for(int r=1;r<=rows;r++){
            for(int c=1;c<=columns;c++){
                if(r==1||r==rows||c==1||c==columns) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

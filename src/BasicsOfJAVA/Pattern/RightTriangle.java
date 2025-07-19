package BasicsOfJAVA.Pattern;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for(int r=1;r<=rows;r++){
            for(int c=1;c<=r;c++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

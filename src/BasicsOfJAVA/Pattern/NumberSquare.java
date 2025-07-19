package BasicsOfJAVA.Pattern;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows : ");
        int rows = sc.nextInt();
        for (int r = 1; r <= rows; r++){
            for(int c = 1; c<=rows; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

package BasicsOfJAVA.Pattern;

import java.util.Scanner;

public class RightTriangleUlta {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows=sc.nextInt();
        int nst = rows,nsp=0;
        for(int r=1;r<=rows;r++){
            for(int c=1;c<=nsp;c++){
                System.out.print("  ");
            }
            for(int c=1;c<=nst;c++){
                System.out.print("* ");
            }
            System.out.println();
            nst--;
            nsp++;
        }

    }
}

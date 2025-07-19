package BasicsOfJAVA.Pattern;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int rows=sc.nextInt();
        int nsp=rows-1,nst=1;
        for (int r=1;r<=rows;r++){
            for (int c=1;c<=nsp;c++){
                System.out.print("  ");
            }
            for(int c=1;c<=nst;c++){
                System.out.print("*"+" ");
            }
            System.out.println();
            nst+=2;
            nsp--;
        }
        nst-=4;
        nsp=1;
        for (int r=1;r<=rows-1;r++){
            for (int c=1;c<=nsp;c++){
                System.out.print("  ");
            }
            for(int c=1;c<=nst;c++){
                System.out.print("*"+" ");
            }
            System.out.println();
            nsp++;
            nst-=2;
        }


    }
}

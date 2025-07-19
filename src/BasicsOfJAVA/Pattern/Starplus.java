package BasicsOfJAVA.Pattern;

import java.util.Scanner;

public class Starplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        int mid = rows/2+1;
        for(int r=1;r<=rows;r++){
            for(int c=1;c<=rows;c++){
                if((r==mid)||(c==mid)) System.out.print("*" + " ");
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}

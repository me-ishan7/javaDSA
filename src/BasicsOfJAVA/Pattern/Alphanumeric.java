package BasicsOfJAVA.Pattern;
import java.util.Scanner;
public class Alphanumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for(int r=1;r<=rows;r++){
            for(int c=1;c<=rows+1-r;c++){
                if(r%2==1)
                    System.out.print((char)(r+64)+ " ");
                else
                    System.out.print(r+" ");
            }
            System.out.println();
        }
    }
}

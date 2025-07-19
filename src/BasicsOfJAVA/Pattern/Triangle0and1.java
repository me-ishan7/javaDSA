package BasicsOfJAVA.Pattern;
import java.util.Scanner;
public class Triangle0and1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for(int r=1;r<=rows;r++){
            for(int c=1;c<=r;c++){
//                if(r%2==1) {
//                    if (c % 2 == 1) {
//                        System.out.print("1" + " ");
//                    } else {
//                        System.out.print("0" + " ");
//                    }
//                }
//                else{
//                    if(c%2==1){
//                        System.out.print("0"+" ");
//                    }
//                    else{
//                        System.out.print("1"+" ");
//                    }
//                    }
                if((r+c)%2==0) System.out.print(1 + " ");
                else System.out.print(0 + " ");
                }
                System.out.println();
            }
        }
    }


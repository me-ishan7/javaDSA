package BasicsOfJAVA.Methods;
import java.sql.SQLOutput;
import java.util.Scanner;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0,b,c;
        System.out.println("Enter three numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("The three numbers are  : "+a+" "+b+" "+c);
        int max = ismaximum(a,b,c);
        System.out.println("greatest among 3 is : "+max);
        int min = isminimum(a,b,c);
        System.out.println("smallest among 3 is : "+min);

    }

    public static int ismaximum(int a,int b,int c) {
//        if(a>b&&a>c) System.out.println(a + " is greatest");
//        else if (b>a&&b>c) System.out.println(b+" is greatest");
//        else System.out.println(c+ " is greatest");

        int max = a;
        if(b>max) b=max;
        if(c>max) max = c;
        return max;
    }

    public static int isminimum(int a,int b,int c) {
//        if(a<b&&a<c) System.out.println(a + " is smallest");
//        else if (b<a&&b<c) System.out.println(b+" is smallest");
//        else System.out.println(c + " is smallest");

        int min = a;
        if (b < min) min = b;
        if (c < min)  min = c;
        return min;
    }
}

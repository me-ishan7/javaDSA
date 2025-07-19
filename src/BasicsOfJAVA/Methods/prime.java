package BasicsOfJAVA.Methods;
import java.util.Scanner;
public class prime {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isprime(n));
    }
    public static boolean isprime(int x){
        if(x<0) x*=-1;
        boolean flag = true;
        if(x==1) System.out.println("Not prime");
        else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}

package BasicsOfJAVA.Loops.Forloops;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean flag = true;//Representing prime number
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(n==1){
            System.out.println("Neither a prime nor a Composite");
        }
        else if(flag){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Composite number");
        }
    }
}

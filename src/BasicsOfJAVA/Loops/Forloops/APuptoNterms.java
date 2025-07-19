package BasicsOfJAVA.Loops.Forloops;
import java.util.Scanner;
public class APuptoNterms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
//        for(int i=1;i<2*n;i+=2){
//            System.out.print(i + ",");
        //if you dont want to do chhedkhaani with i or formula nahi pata
        int a = 4,d = 3;
        for(int i=1;i<=n;i++){
            System.out.print(a + ",");
            a+=3;
        }
        System.out.println("Now printing GP");
        // 1,2,4,8,16,32.....
        int a1 = 1, r = 2;
        for(int i=1;i<=n;i++){
            System.out.print(a1 + ",");
            a1*=2;
        }
    }
}

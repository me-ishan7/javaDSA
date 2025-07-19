package BasicsOfJAVA.Loops.Forloops;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int count = 0;
        if(n==0)
            count=1;

        while(n!=0){
            count+=1;
            n /= 10;
        }
        System.out.println(count);
    }
}

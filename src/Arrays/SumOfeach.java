package Arrays;
import java.util.Scanner;
public class SumOfeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int sum = 0 ;
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}

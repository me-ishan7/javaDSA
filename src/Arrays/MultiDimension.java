package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the values : ");

        //Taking Input
        for(int row = 0;row<arr.length;row++){
            //for each column in every row
            for(int col = 0;col<arr[row].length;col++){
               arr[row][col] = sc.nextInt();
            }
        }
        //output
//        for(int row = 0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        //enhanced loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

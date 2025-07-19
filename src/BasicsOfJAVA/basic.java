package BasicsOfJAVA;
import java.util.Arrays;
public class basic {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println("4");
//        System.out.println(4);
//        System.out.println(4+3);
//        System.out.println("4+3");
        int[] arr = {2,4,5,6,7,23,64,43,21};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
//        int[] ans = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                swap(arr[i],arr[j]);

            }
        }
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }

}

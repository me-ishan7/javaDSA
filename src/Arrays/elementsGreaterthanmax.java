package Arrays;
import java.util.Arrays;
public class elementsGreaterthanmax {
    public static void main(String[] args) {
        int[] arr = {3,4,78,65,32,12,6,9,61,23,53};
        int ans = count(arr);
        System.out.println(ans);
    }
    public static int count(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>12) count++;
        }
        return count;
    }
}

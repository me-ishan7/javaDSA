package Arrays;
import java.util.Arrays;
public class passingInfuction {
    public static void main(String[] args) {
        int[] nums = {2,4,5,8,3};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void change(int[] arr) {
        arr[2] = 98;

    }
}

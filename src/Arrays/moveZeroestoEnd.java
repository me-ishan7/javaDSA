package Arrays;

import java.util.Arrays;

public class moveZeroestoEnd {
    public static void main(String[] args) {
        int[] arr = {0,8,0,0,12,0,3};

        int n = arr.length, x = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] != 0){
                arr[x] = arr[i];
                x++;
            }
        }
        for(int i = x; i < n; i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}

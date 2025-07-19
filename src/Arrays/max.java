package Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {-1,-3,-4,-6,-7,-88,-46};
        System.out.println("maximum value in the array is : ");
        System.out.println( max(arr));
        System.out.println("maxval in the given range is : "+maxinrange(arr,2,5));
    }

    public static int max(int[] arr)
    {
        if (arr == null) return -1;
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
    }
        return max;

    }
    public static int maxinrange(int[] arr, int start , int end){
        if (start > end) return -1;
        if( arr == null) return -1;
        int max = arr[start];
        for(int i = start+1;i<=end;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
}

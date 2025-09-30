package Arrays;

public class frequenciesInArray {
    public static void main(String[] args) {
        int[] arr = {10,10,10,20,20,30,30,30,30};

        int ans = freq(arr, 1, 1, 1);
        System.out.println(ans);

    }
    static int freq(int[] arr,int index, int res, int count){
        if(index >= arr.length ){
            return Math.max(count , res);
        }
        if(arr[index] == arr[index-1]) {
            return freq(arr, index + 1, res, count + 1);
        }
        else{
            return freq(arr, index + 1, Math.max(res, count), 1);
        }
    }
}

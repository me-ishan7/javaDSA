package Recursion;

public class houseRobber {
    public static void main(String[] args) {
        int[] arr = {2,9,7,3,1,4};
        int n = arr.length;

        int ans = robHouse(arr, n, 0);
        System.out.println(ans);
    }
    static int robHouse(int[] arr, int size, int index) {
        if(index >= size) return 0;

        int option1 = arr[index] + robHouse(arr, size, index + 2);
        int option2 = 0 + robHouse(arr, size,index + 1);
        int ans = Math.max(option1, option2);
        return ans;
    }
}

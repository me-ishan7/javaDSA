package Recursion;

import java.util.ArrayList;
import java.util.List;

public class printAllPermutations {
    public static void main(String[] args){
        int [] arr = {1, 2, 3};
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[n];

        recurPermute(arr, n, ans, ds, freq);
        System.out.println(ans);
    }
    static void recurPermute(int[] arr, int n, List<List<Integer>> ans, List<Integer> ds, boolean[] freq ){
        if(ds.size() == n){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i < n; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(arr[i]);
                recurPermute(arr, n, ans, ds, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}

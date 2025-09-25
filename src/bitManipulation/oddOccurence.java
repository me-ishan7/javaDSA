package bitManipulation;

public class oddOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,2,3,1,3,5,4,4,5,3};
        int Xor = arr[0];
        for(int i = 1; i < arr.length; i++){
            Xor = Xor ^ arr[i];
        }
        System.out.println(Xor);
    }
}

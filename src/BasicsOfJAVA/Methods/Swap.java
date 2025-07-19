package BasicsOfJAVA.Methods;

public class Swap {
    public static void main(String[] args) {
        int a = 10,b = 20;
        swap(a,b);
        System.out.println(a+" "+b + " main function block here " +
                "swapping is not done");
    }
    static void swap(int a, int b){
        int temp = a;
         a = b;
         b = temp;
        System.out.println(a+" "+b+" Swap block/Function and done " +
                "succesfully");

    }
}

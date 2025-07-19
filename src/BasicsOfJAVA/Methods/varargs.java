package BasicsOfJAVA.Methods;
import java.util.Arrays;
public class varargs {
    public static void main(String[] args) {
        fun(1,2,4,5,6,623,25,642,1,2,54,65,6,8,9);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

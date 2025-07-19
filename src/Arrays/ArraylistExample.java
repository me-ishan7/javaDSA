package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArraylistExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Wrapper Classes
        Integer a = new Integer(4);
        System.out.println(a);
        Integer b = Integer.valueOf(9);
        System.out.println(b);


        // creating array list
        ArrayList<Integer> l = new ArrayList<>();

        // adding element in the list
        l.add(4);
        l.add(5);
        l.add(6);

        System.out.println(l.get(2));

        //to print directly
        System.out.println(l);

        // adding element at any index
        l.add(1,100);
        System.out.println(l);

        //modifying any element at any index
        l.set(3,11);
        System.out.println(l);

        //remove an element at index i
        l.remove(1);
        System.out.println(l);

        //removing any element
        l.remove(Integer.valueOf(11));
        System.out.println(l);

        // check if exists
        boolean ans = l.contains(Integer.valueOf(4));
        System.out.println(ans);

        // you can add element of anytype if you dont declare the datatype<inside this>
        ArrayList l1 = new ArrayList();
        l1.add("hello");
        l1.add(4);
        l1.add("Ishan");
        System.out.println(l1);

        //commit github


    }

}

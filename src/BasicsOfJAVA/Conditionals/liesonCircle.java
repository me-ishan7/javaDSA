package BasicsOfJAVA.Conditionals;
import java.util.Scanner;
// determine whether a point lies on the circle,inside or outside the circle
public class liesonCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 4,y=6 , radius = 2 ;
        System.out.println("Enter the coordinates : (x1,y1)");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int d = ((x-x1)*(x-x1))+((y-y1)*(y-y1));
        System.out.println(d);
        if(d*d<radius){
            System.out.println("Lies in Circle");
        } else if (d*d == radius) {
            System.out.println("lies on the Circle");

        }
        else{
            System.out.println("Lies Outside the Circle");
        }

    }
}

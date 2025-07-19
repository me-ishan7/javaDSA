package BasicsOfJAVA.Conditionals;
import java.util.Scanner;
public class AreagreaterPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length :");
        int length = sc.nextInt();
        System.out.println("Enter Width :");
        int width = sc.nextInt();
        int area = 2*(length + width);
        int perimeter = 2*(length + width);
        if (area >perimeter){
            System.out.println("Area is greater than perimeter");

        } else if (area == perimeter) {
            System.out.println("Area is equal to perimeter");

        } else{
            System.out.println("Area is less than Perimeter");
        }
    }
}

package BasicsOfJAVA.Methods;

public class armstrong {
    public static void main(String[] args) {
        for (int i=100;i<1000;i++)
        {
            isarmstrong(i);
        }
    }
    public static void isarmstrong(int n){
        int sum  = 0,rem;
        int original = n;
        while(n!=0){
            rem = n % 10;
            sum = sum + rem*rem*rem;
            n/=10;
        }
        if (original==sum) System.out.println(sum);
    }
}
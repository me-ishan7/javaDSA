package Recursion;

public class name5time {
    public static void main(String[] args) {
        int n = 5;
        String name = "Ishan";
        print5time(name,0,n);//passing wht to print and from where to where
    }
    static void print5time(String str,int i ,int n){
        if(i==n) return;
        System.out.println(str);

        print5time(str,i+1,n);
    }
}


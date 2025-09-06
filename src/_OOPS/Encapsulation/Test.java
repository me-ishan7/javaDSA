package _OOPS.Encapsulation;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.println("Enter your name : ");
        student.setName(sc.next());
        System.out.println("Enter Roll no : ");
        student.setRollNo(sc.nextInt());
        System.out.println("Enter age : ");
        student.setAge(sc.nextInt());
        System.out.println("Name : " + student.getName());
        System.out.println("Roll no : " + student.getRollNo());
        System.out.println("Age is : " + student.getAge());

        BankAccount details = new BankAccount();
        details.setBalance(3000);
        details.setAccNo(923372000);
        details.setHolderName("Ishan");

        String name = details.getHolderName();
        System.out.println("Account Holder Name : " + name);
        System.out.println("Current Balance : " + details.getBalance());

        int balance = details.Deposit(8000);
        System.out.println("Updated Balance : " + balance);

        details.Withdraw(12000);

    }
}

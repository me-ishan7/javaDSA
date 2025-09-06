package _OOPS.Encapsulation;

public class Student {
    private String name;
    private int rollNo;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRollNo(int rollNo){
        if(rollNo < 0) System.out.println("Enter Positive value.");
        else this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
    public void setAge(int x){
        if(x < 0) System.out.println("Enter Positive value.");
        else this.age = x;
    }
    public int getAge(){
        return age;
    }
}

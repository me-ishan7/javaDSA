package _OOPS.Inheritance.animals;

public class Animal {
    private String name;
    private int age;

    public void eat(){
        System.out.println("This animal is Eating");
    }
    public void speak(){
        System.out.println("Saying Hello");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }


}

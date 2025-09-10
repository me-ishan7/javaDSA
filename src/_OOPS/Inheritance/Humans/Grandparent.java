package _OOPS.Inheritance.Humans;

public class Grandparent {
    String name;
    int age;

    public Grandparent(){
        System.out.println("GrandParent constructor Called.");
    }

    public void dances(){
        System.out.println("dancing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

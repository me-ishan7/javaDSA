package _OOPS.Inheritance.animals;

import _OOPS.Inheritance.Humans.Child;

public class Test {
    public static void main(String[] args){
//        Dog dog = new Dog();
//        dog.setName("Shepherd");
//        dog.setAge(12);
//
//        System.out.println(dog.getName());
//        System.out.println(dog.getAge());
//        dog.speak();
//        dog.eat();

        Child child = new Child();
        child.setName("Ishan");
        String name = child.getName();
        System.out.println("The child name is : " + name);



    }
}

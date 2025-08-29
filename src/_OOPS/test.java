package _OOPS;

public class test {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.color = "blue";
        dog.breed = "German Sheperd";
        dog.running(23);
        System.out.println();
        System.out.println(dog.speed);
    }
}

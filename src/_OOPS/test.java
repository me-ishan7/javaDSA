package _OOPS;

public class test {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.color = "blue";
        dog.breed = "German Sheperd";
        dog.legs = 4;
        dog.running(23);

        System.out.println(dog.color);
        System.out.println(dog.speed);
    }
}

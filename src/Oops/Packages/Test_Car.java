package Oops.Packages;

public class Test_Car {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "blue";
        car.Brand = "BMW";
        car.year = 1992;

        car.accelerate(40);
        car.brake(5);

        System.out.println(car.speed);

    }
}

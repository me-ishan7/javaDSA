package Oops.Packages;

public class Car {
    String color;
    String Brand;
    String Model;
    int year;
    int speed;
    public void accelerate(int increment){
        speed+=increment;
    }
    public void brake(int decrement){
        speed-=decrement;
        if(speed < 0) speed = 0 ;
    }

}

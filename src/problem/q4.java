package problem;
//Create an abstract class Shape with abstract method area() and implement it in Circle and Rectangle.


import java.awt.*;

abstract class Vehicle{
    abstract void start();

}
class Car1 extends Vehicle{
    @Override
    void start() {
        System.out.println("start the car");
    }
}
class  Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("start the bike");
    }
}


public class q4 {
    public static void main(String[] args) {
        Vehicle v= new Car1();
        v.start();

        Vehicle V1= new Bike();
        V1.start();

    }
}

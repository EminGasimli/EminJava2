package Lesson33.Task3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "BMW";
        car.speed = 120;
        car.move();

        Bike bike = new Bike();
        bike.brand = "Giant";
        bike.speed = 30;
        bike.move();

        Plane plane = new Plane();
        plane.brand = "Boeing";
        plane.speed = 900;
        plane.move();
    }
}

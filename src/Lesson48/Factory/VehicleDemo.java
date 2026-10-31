package Lesson48.Factory;

public class VehicleDemo {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.createVehicle("car");
        Vehicle bike = factory.createVehicle("bike");

        car.move();
        bike.move();
    }
}
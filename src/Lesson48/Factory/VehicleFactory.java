package Lesson48.Factory;

public class VehicleFactory {
    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        }
        else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }

        return null;
    }
}
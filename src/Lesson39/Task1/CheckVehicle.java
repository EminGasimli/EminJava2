package Lesson39.Task1;

public class CheckVehicle {
    public static void checkVehicle(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            System.out.println("Bu obyekt Car sinfinə aiddir.");
        }
        else if (vehicle instanceof Bike) {
            System.out.println("Bu obyekt Bike sinfinə aiddir.");
        }
        else {
            System.out.println("Naməlum Vehicle.");
        }
    }
}
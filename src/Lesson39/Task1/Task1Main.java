package Lesson39.Task1;

public class Task1Main {

    public static void main(String[] args) {

        Car car1 = new Car("Bugatti", 490);
        Car car2 = new Car("Koenigsegg", 530);
        Bike bike = new Bike("Bike", 50);

        car1.move();
        car2.move();
        bike.move();

        System.out.println();

        CheckVehicle.checkVehicle(car1);
        CheckVehicle.checkVehicle(car2);
        CheckVehicle.checkVehicle(bike);
    }
}
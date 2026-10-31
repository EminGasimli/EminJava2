package Lesson48.Builder;

public class BuilderDemo {
    public static void main(String[] args) {

        Car car = new Car.Builder()
                .setBrand("BMW")
                .setModel("M5")
                .setYear(2025)
                .setColor("Black")
                .build();

        car.displayInfo();
    }
}
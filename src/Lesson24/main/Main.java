package Lesson24.main;
import Lesson24.models.Car;
import Lesson24.drivers.Driver;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "BMW";
        car1.year = 2022;

        Car car2 = new Car();
        car2.brand = "Mercedes";
        car2.year = 2023;

        Driver driver1 = new Driver();
        driver1.name = "Emin";
        driver1.experienceYear = 5;

        Driver driver2 = new Driver();
        driver2.name = "Murad";
        driver2.experienceYear = 8;

        System.out.println("1-ci Maşın");
        car1.showCar();
        System.out.println();

        System.out.println("2-ci Maşın");
        car2.showCar();
        System.out.println();

        System.out.println("1-ci Sürücü");
        driver1.showDriver();
        System.out.println();

        System.out.println("2-ci Sürücü");
        driver2.showDriver();
    }
}

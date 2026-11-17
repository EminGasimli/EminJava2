package Lesson53.Task3;

public class CarMain {

    public static void main(String[] args) {

        Car[] cars = {
                new BMW(),
                new Mercedes(),
                new Bugatti()
        };

        Car winner = cars[0];

        for (Car car : cars) {

            System.out.println(car.getName() + " - " + car.speed() + " km/s");

            if (car.speed() > winner.speed()) {
                winner = car;
            }
        }

        System.out.println("\nQalib:");

        System.out.println(winner.getName());
    }
}
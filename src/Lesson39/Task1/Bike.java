package Lesson39.Task1;

public class Bike extends Vehicle implements Movable {
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println("Bike hərəkət edir. Brand: "
                + getBrand() + ", Speed: " + getSpeed());
    }
}

package Lesson29;

public class Tablet {
    String modelName;
    int serialNumber;
    static int counter = 1000;

    public Tablet(String modelName) {
        this.modelName = modelName;
        counter++;
        serialNumber = counter;
    }

    public void showInfo() {
        System.out.println("Model: " + modelName + ", Seriya No: " + serialNumber);
    }
}
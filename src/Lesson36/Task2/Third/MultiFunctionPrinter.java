package Lesson36.Task2.Third;

public class MultiFunctionPrinter implements Printable, Scannable {

    @Override
    public void print() {
        System.out.println("Printer çap edir.");
    }

    @Override
    public void scan() {
        System.out.println("Printer skan edir.");
    }
}

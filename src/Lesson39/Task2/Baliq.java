package Lesson39.Task2;

public class Baliq implements Yeyebilen, Uzebilen, Sesdebilen {

    @Override
    public void ye() {
        System.out.println("Balıq yeyir.");
    }

    @Override
    public void üz() {
        System.out.println("Balıq üzür.");
    }

    @Override
    public void səsVer() {
        System.out.println("Balıq səs çıxarır.");
    }
}
package Lesson39.Task2;

public class Qartal implements Yeyebilen, Ucabilen, Sesdebilen {
    @Override
    public void ye() {
        System.out.println("Qartal yeyir.");
    }

    @Override
    public void uç() {
        System.out.println("Qartal uçur.");
    }

    @Override
    public void səsVer() {
        System.out.println("Qartal səs çıxarır.");
    }
}
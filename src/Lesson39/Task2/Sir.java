package Lesson39.Task2;

public class Sir implements Yeyebilen, Qacabilen, Sesdebilen {

    @Override
    public void ye() {
        System.out.println("Şir yeyir.");
    }

    @Override
    public void qaç() {
        System.out.println("Şir qaçır.");
    }

    @Override
    public void səsVer() {
        System.out.println("Şir səs çıxarır.");
    }
}
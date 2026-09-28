package Lesson39.Task2;

public class Task2Main {
    public static void main(String[] args) {
        Qartal qartal = new Qartal();
        Sir şir = new Sir();
        Baliq balıq = new Baliq();

        qartal.ye();
        qartal.uç();
        qartal.səsVer();

        System.out.println();

        şir.ye();
        şir.qaç();
        şir.səsVer();

        System.out.println();

        balıq.ye();
        balıq.üz();
        balıq.səsVer();
    }
}
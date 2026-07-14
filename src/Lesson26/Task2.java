package Lesson26;

public class Task2 {
    static void cutTek(int eded) {
        if (eded % 2 == 0)
            System.out.println(eded + " cütdür.");
        else
            System.out.println(eded + " təkdir");
    }

    public static void main(String[] args) {
        cutTek(5);
        cutTek(8);
        cutTek(11);
        cutTek(20);
        cutTek(31);
    }
}

package Lesson26;

public class Task7 {
    static void tekrarla(String soz, int say) {
        for (int i = 1; i <= say; i++) {
            System.out.print(soz + " ");
        }
    }

    public static void main(String[] args) {
        tekrarla("Java", 3);
    }
}

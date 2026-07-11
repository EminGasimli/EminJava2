package Lesson25;

public class Task6 {
    static int say = 0;

    static void cagir() {
        say++;
        System.out.println("Bu metod " + say + " dəfə çağırıldı.");
    }

    public static void main(String[] args) {
        cagir();
        cagir();
        cagir();
        cagir();
        cagir();
    }
}
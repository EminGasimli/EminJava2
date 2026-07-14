package Lesson26;

public class Task17 {
    static boolean cutdur(int eded) {
        if (eded % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        if (cutdur(7)) {
            System.out.println("Cütdür");
        }
        else {
            System.out.println("Təkdir");
        }
    }
}

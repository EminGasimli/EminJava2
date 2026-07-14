package Lesson26;

public class Task1 {
    static void kvadratCek(int olcu) {
        for (int i = 1; i <= olcu; i++) {
            for (int j = 1; j <= olcu; j++) {

                if (i == 1 || i == olcu || j == 1 || j == olcu)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        kvadratCek(4);
    }
}
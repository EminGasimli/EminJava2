package Lesson28;

public class Difference {
    public static void main(String[] args) {
        int tek = 0;
        int cut = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0){
                cut += i;
                }
            else {
                tek += i;
            }
            i++;
        }
        System.out.println("Tək cəmi = " + tek);
        System.out.println("Cüt cəmi = " + cut);
        System.out.println("Fərq = " + (cut - tek));
    }
}
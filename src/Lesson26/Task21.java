package Lesson26;

public class Task21 {
    static boolean sifreYoxla(String sifre) {
        if (sifre.length() < 8) {
            return false;
        }
        for (int i = 0; i < sifre.length(); i++) {
            if (Character.isDigit(sifre.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sifreYoxla("Java1234"));
        System.out.println(sifreYoxla("abcdef"));
        System.out.println(sifreYoxla("12345678"));
    }
}

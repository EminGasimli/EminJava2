package Lesson26;

public class Task11 {
    static void yasYoxla(int yas) {
        if (yas >= 0 && yas <= 12) {
            System.out.println("Uşaqdır");
        }
        else if (yas <= 17) {
            System.out.println("Yeniyetmədir");
        }
        else if (yas <= 64){
            System.out.println("Böyükdür");
        }
        else{
            System.out.println("Yaşlıdır");
        }
    }

    public static void main(String[] args) {
        yasYoxla(8);
        yasYoxla(15);
        yasYoxla(30);
        yasYoxla(70);
    }
}

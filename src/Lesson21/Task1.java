package Lesson21;
import java.util.ArrayList;

public class Task1 {
    static void main() {
        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("Alma");
        meyveler.add("Armud");
        meyveler.add("Banan");
        System.out.println("Siyahı: " + meyveler);
        meyveler.remove("Armud");
        meyveler.remove(0);
        System.out.println(meyveler);
        System.out.println("Element sayı: " + meyveler.size());
    }
}

package Lesson22;
import java.util.ArrayList;

public class Task2 {
    static void main() {
        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("Alma");
        meyveler.add("Armud");
        meyveler.add("Banan");
        meyveler.add("Portağal");
        meyveler.add("Üzüm");
        System.out.println("meyveler:");
        for (String meyve : meyveler) {
            System.out.println(meyve);
        }
    }
}

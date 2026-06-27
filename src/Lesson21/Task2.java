package Lesson21;
import java.util.HashMap;

public class Task2 {
    static void main() {
        HashMap<Integer, String> Masinlar = new HashMap<>();
        Masinlar.put(1, "Bugatti");
        Masinlar.put(2, "Koenigsegg");
        Masinlar.put(3, "Pagani");
        System.out.println("HashMap: " + Masinlar);
        Masinlar.remove(2);
        System.out.println(Masinlar);
        System.out.println("Element sayı: " + Masinlar.size());
    }
}

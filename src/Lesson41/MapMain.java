package Lesson41;
import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Ali");
        students.put(2, "Vali");
        students.put(3, "Aysel");
        students.put(4, "Murad");

        System.out.println("Map: " + students);

        System.out.println("get(): " + students.get(2));

        students.put(2, "Huseyn");

        System.out.println("Yeniləndikdən sonra: " + students);

        students.remove(4);

        System.out.println("remove-dan sonra: " + students);

        System.out.println("size(): " + students.size());

        System.out.println("containsKey(1): " + students.containsKey(1));

        System.out.println("containsValue(\"Ali\"): " + students.containsValue("Ali"));

        System.out.println("isEmpty(): " + students.isEmpty());

        System.out.println("Keys: " + students.keySet());

        System.out.println("Values: " + students.values());

        System.out.println("Entries:");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        students.clear();

        System.out.println("clear-dan sonra: " + students);
        System.out.println("isEmpty(): " + students.isEmpty());
    }
}
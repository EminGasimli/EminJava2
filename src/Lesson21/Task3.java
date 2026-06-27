package Lesson21;
import java.util.Arrays;

public class Task3 {
    static void main() {
        int[] ededler = {45, 12, 78, 3, 56, 23, 9};
        System.out.println("Sıralanmamış Halda:");
        System.out.println(Arrays.toString(ededler));
        Arrays.sort(ededler);
        System.out.println("Arrays.sort() nəticəsi:");
        System.out.println(Arrays.toString(ededler));
    }
}

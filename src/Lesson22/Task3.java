package Lesson22;
import java.util.Arrays;

public class Task3 {
    static void main() {
        int[] ededler = {8, 3, 12, 5, 1};
        System.out.println(Arrays.toString(ededler));
        Arrays.sort(ededler);
        System.out.println("Sort edilmis array:");
        System.out.println(Arrays.toString(ededler));
    }
}

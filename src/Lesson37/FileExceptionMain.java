package Lesson37;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExceptionMain {
    public static void main(String[] args) {
        try {
            File file = new File("olmayan_fayl.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException baş verdi.");
            System.out.println("Fayl tapılmadı.");
        }
    }
}

package Lesson46;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileMain {
    public static void main(String[] args) {
        File folder = new File("myFolder");

        if (!folder.exists()) {
            folder.mkdir();
        }

        File file = new File(folder, "qeyd.txt");

        if (file.exists()) {
            System.out.println("Fayl artıq var");
        }
        else {
            try {
                file.createNewFile();

                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write("Java-da fayllarla işləmək maraqlıdır!");

                bw.close();

                System.out.println("Fayl yaradıldı və məlumat yazıldı.");
            }
            catch (IOException e) {
                System.out.println("Xəta baş verdi: " + e.getMessage());
            }
        }
    }
}
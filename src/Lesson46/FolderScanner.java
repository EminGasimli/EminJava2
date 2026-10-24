package Lesson46;
import java.io.File;

public class FolderScanner {
    static int faylSayi = 0;

    public static void fayllariTap(File folder) {
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Folder tapılmadı!");
            return;
        }

        File[] files = folder.listFiles();

        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                faylSayi++;
                System.out.println(file.getAbsolutePath());
            }
            else if (file.isDirectory()) {
                fayllariTap(file);
            }
        }
    }

    public static void main(String[] args) {
        File folder = new File("C:/Users");

        fayllariTap(folder);

        System.out.println("Ümumi fayl sayı: " + faylSayi);
    }
}
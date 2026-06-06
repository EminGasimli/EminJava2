package Lesson16;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fuel = 50;

        while (fuel > 0) {
            System.out.print("Neçə litr xərcləndi? ");
            int used = sc.nextInt();

            fuel -= used;

            if (fuel > 0) {
                System.out.println("Qaldı: " + fuel);
            } else {
                System.out.println("Yanacaq bitdi!");
            }
        }
    }
}

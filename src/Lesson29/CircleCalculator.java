package Lesson29;

import java.util.Scanner;
public class CircleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radiusu daxil edin: ");
        double radius = sc.nextDouble();

        double sahe = Math.PI * Math.pow(radius, 2);
        double perimetr = 2 * Math.PI * radius;

        System.out.println("Dairənin sahəsi: " + sahe);
        System.out.println("Yuvarlaqlaşdırılmış sahə: " + Math.round(sahe));
        System.out.println("Dairənin perimetri: " + perimetr);

        System.out.print("Birinci radiusu daxil edin: ");
        double r1 = sc.nextDouble();

        System.out.print("İkinci radiusu daxil edin: ");
        double r2 = sc.nextDouble();

        System.out.println("Böyük radius: " + Math.max(r1, r2));
        System.out.println("Kiçik radius: " + Math.min(r1, r2));

        sc.close();
    }
}
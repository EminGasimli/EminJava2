package Lesson43;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeExercises {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Bugünkü tarix: " + today);

        LocalDate after10Days = today.plusDays(10);
        System.out.println("10 gün sonra: " + after10Days);

        LocalDate givenDate = LocalDate.of(2026, 10, 12);
        System.out.println("İl: " + givenDate.getYear());
        System.out.println("Ay: " + givenDate.getMonthValue());
        System.out.println("Gün: " + givenDate.getDayOfMonth());

        LocalTime currentTime = LocalTime.now();
        LocalTime after2Hours = currentTime.plusHours(2);
        System.out.println("Hazırkı saat: " + currentTime);
        System.out.println("2 saat sonra: " + after2Hours);

        LocalTime time1 = LocalTime.of(10, 30);
        LocalTime time2 = LocalTime.of(15, 45);

        if (time1.isBefore(time2)) {
            System.out.println(time1 + " daha əvvəldir.");
        }
        else if (time2.isBefore(time1)) {
            System.out.println(time2 + " daha əvvəldir.");
        }
        else {
            System.out.println("Saatlar eynidir.");
        }

        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime before3Days = currentDateTime.minusDays(3);
        System.out.println("Hazırkı tarix və saat: " + currentDateTime);
        System.out.println("3 gün əvvəl: " + before3Days);

        LocalDateTime givenDateTime = LocalDateTime.of(2026, 10, 10, 15, 30);

        LocalDate extractedDate = givenDateTime.toLocalDate();
        System.out.println("Tarix hissəsi: " + extractedDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Formatlanmış tarix: " + givenDateTime.format(formatter));

        ZonedDateTime bakuTime = ZonedDateTime.now(ZoneId.of("Asia/Baku"));

        System.out.println("Bakı vaxtı: " + bakuTime);

        ZonedDateTime londonTime = bakuTime.withZoneSameInstant(ZoneId.of("Europe/London"));

        System.out.println("London vaxtı: " + londonTime);
    }
}
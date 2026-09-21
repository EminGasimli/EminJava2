package Lesson36.Task3;

public class School {
    public void door1(Person person) {
        System.out.println(person.ad + " " + person.soyad + " door1-dən daxil oldu.");
    }

    public void door2(Person person) {
        if (person instanceof Teacher) {
            System.out.println(person.ad + " " + person.soyad + " door2-dən daxil oldu.");
        } else {
            System.out.println(person.ad + " " + person.soyad + " door2-dən daxil ola bilməz.");
        }
    }

    public void door3(Person person) {
        if (person instanceof Teacher || person instanceof Library) {
            System.out.println(person.ad + " " + person.soyad + " door3-dən daxil oldu.");
        } else {
            System.out.println(person.ad + " " + person.soyad + " door3-dən daxil ola bilməz.");
        }
    }
}

package Lesson23;
public class Task3 {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Emin";
        p1.age = 20;
        p1.email = "emin@gmail.com";

        Person p2 = new Person();
        p2.name = "Aysel";
        p2.age = 19;
        p2.email = "aysel@gmail.com";

        Person p3 = new Person();
        p3.name = "Murad";
        p3.age = 21;
        p3.email = "murad@gmail.com";

        System.out.println("1-ci şəxs:");
        System.out.println("Ad: " + p1.name);
        System.out.println("Yaş: " + p1.age);
        System.out.println("Email: " + p1.email);

        System.out.println();

        System.out.println("2-ci şəxs:");
        System.out.println("Ad: " + p2.name);
        System.out.println("Yaş: " + p2.age);
        System.out.println("Email: " + p2.email);

        System.out.println();

        System.out.println("3-cü şəxs:");
        System.out.println("Ad: " + p3.name);
        System.out.println("Yaş: " + p3.age);
        System.out.println("Email: " + p3.email);
    }
}
class Person {
    String name;
    int age;
    String email;
}
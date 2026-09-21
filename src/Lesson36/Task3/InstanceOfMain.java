package Lesson36.Task3;

public class InstanceOfMain {
    public static void main(String[] args) {
        School school = new School();

        Person student = new Student("Ali", "Aliyev");
        Person teacher = new Teacher("Vali", "Valiyev");
        Person library = new Library("Aysel", "Huseynova");
        Person driver = new Driver("Murad", "Mammadov");

        school.door1(student);
        school.door1(teacher);
        school.door1(library);
        school.door1(driver);

        System.out.println();

        school.door2(student);
        school.door2(teacher);
        school.door2(library);
        school.door2(driver);

        System.out.println();

        school.door3(student);
        school.door3(teacher);
        school.door3(library);
        school.door3(driver);
    }
}

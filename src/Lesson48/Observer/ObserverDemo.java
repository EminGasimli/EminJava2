package Lesson48.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        School school = new School();

        Student student1 = new Student("Ali");
        Student student2 = new Student("Aysel");
        Student student3 = new Student("Murad");

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        school.announce("Sabah dərslər saat 09:00-da başlayacaq!");

        school.announce("Cümə günü məktəbdə tədbir keçiriləcək!");
    }
}
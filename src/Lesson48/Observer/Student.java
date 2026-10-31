package Lesson48.Observer;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void receiveAnnouncement(String message) {
        System.out.println(name + " elani aldı: " + message);
    }
}

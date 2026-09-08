package Lesson33.Task4;

public class Player {
    String name;
    int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Ad: " + name);
        System.out.println("Yaş: " + age);
    }
}

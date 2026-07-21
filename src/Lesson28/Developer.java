package Lesson28;

public class Developer {
    String name;
    String language;
    int experience;
    Developer() {
        this("Unknown");
    }
    Developer(String name) {
        this(name, "Java");
    }
    Developer(String name, String language) {
        this(name, language, 0);
    }
    Developer(String name, String language, int experience) {
        this.name = name;
        this.language = language;
        this.experience = experience;
    }
    void show() {
        System.out.println(name + " " + language + " " + experience);
    }
    public static void main(String[] args) {
        Developer d1 = new Developer();
        Developer d2 = new Developer("Emin");
        Developer d3 = new Developer("Ali", "C#");
        Developer d4 = new Developer("Veli", "Java", 5);
        d1.show();
        d2.show();
        d3.show();
        d4.show();
    }
}
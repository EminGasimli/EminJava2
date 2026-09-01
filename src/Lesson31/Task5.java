package Lesson31;

public class Task5 {
    record Student(String name, int age, double grade) {
        boolean isPassed() {
            return grade >= 51;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ali", 15, 87.5);
        Student student2 = new Student("Vali", 16, 45.0);
        Student student3 = new Student("Aysel", 15, 92.0);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println();

        Student[] students = {student1, student2, student3};

        for (Student student : students) {
            if (student.isPassed()) {
                System.out.println(student.name() + " keçdi");
            }
            else {
                System.out.println(student.name() + " kəsildi");
            }
        }

        Student enYuksek = students[0];

        for (Student student : students) {
            if (student.grade() > enYuksek.grade()) {
                enYuksek = student;
            }
        }

        System.out.println("\nƏn yüksək bal: "
                + enYuksek.name() + " - "
                + enYuksek.grade());
    }
}
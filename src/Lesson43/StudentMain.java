package Lesson43;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ali", 85));
        students.add(new Student("Aysel", 45));
        students.add(new Student("Murad", 72));
        students.add(new Student("Leyla", 95));
        students.add(new Student("Orxan", 38));

        List<Student> passedStudents = students.stream().filter(student -> student.getScore() > 50).collect(Collectors.toList());

        System.out.println("Balı 50-dən böyük olan tələbələr:");
        passedStudents.forEach(System.out::println);

        List<String> upperCaseNames = students.stream().map(student -> student.getName().toUpperCase()).collect(Collectors.toList());

        System.out.println("\nBöyük hərflərlə tələbə adları:");
        upperCaseNames.forEach(System.out::println);

        Student highestScoreStudent = students.stream().max(Comparator.comparingInt(Student::getScore)).orElse(null);

        if (highestScoreStudent != null) {
            System.out.println("\nƏn yüksək bal toplayan tələbə:");
            System.out.println(highestScoreStudent);
        }
    }
}
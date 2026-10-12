package Lesson43;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ali", 85));
        students.add(new Student("Aysel", 45));
        students.add(new Student("Murad", 70));
        students.add(new Student("Leyla", 90));

        Function<Student, String> nameFunction = new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        };

        Predicate<Student> passedPredicate = new Predicate<Student>() {
            @Override
            public boolean test(Student student) {
                return student.getScore() >= 50;
            }
        };

        Consumer<String> printConsumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        };

        students.stream()
                .filter(passedPredicate)
                .map(nameFunction)
                .forEach(printConsumer);
    }
}
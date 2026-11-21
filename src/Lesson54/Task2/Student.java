package Lesson54.Task2;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades = new ArrayList<>();
    private LocalDateTime examDate;

    public Student(String name, LocalDateTime examDate) {
        this.name = name;
        this.examDate = examDate;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getAverage() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public boolean isPassed() {
        return getAverage() > 60;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getExamDate() {
        return examDate;
    }

    @Override
    public String toString() {
        return name + " | Average: " + getAverage() + " | Passed: " + isPassed() + " | Exam: " + examDate;
    }
}
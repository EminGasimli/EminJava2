package Lesson35.Task5;

public class TechCompany extends Company {
    @Override
    public Manager hire() {
        return new Manager();
    }
}

package Lesson53.Task4;

public class UserMain {
    public static void main(String[] args) {
        User user = new User("admin");
        try {
            user.setPassword("123456");
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
package Lesson53.Task4;

public class User {
    private String username;
    private String password;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        if (password.length() < 6) {
            throw new IllegalArgumentException("Password en azi 6 simvol olmalidir!");
        }
        this.password = password;
    }

    public String getPassword() {
        if (password == null) {
            return "Password teyin edilmeyib";
        }
        return "*".repeat(password.length());
    }
}
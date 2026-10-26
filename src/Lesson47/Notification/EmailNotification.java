package Lesson47.Notification;

public class EmailNotification implements Notification {
    @Override
    public void sendMessage(String text) {
        System.out.println("Email ile gonderildi: " + text);
    }
}
package Lesson47.Notification;

public class SmsNotification implements Notification {
    @Override
    public void sendMessage(String text) {
        System.out.println("SMS ile gonderildi: " + text);
    }
}
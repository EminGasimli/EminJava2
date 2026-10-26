package Lesson47.Notification;

public class PushNotification implements Notification {
    @Override
    public void sendMessage(String text) {
        System.out.println("Push notification gonderildi: " + text);
    }
}
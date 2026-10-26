package Lesson47.Notification;

public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SmsNotification();
        } else if (type.equalsIgnoreCase("push")) {
            return new PushNotification();
        }

        return null;
    }
}
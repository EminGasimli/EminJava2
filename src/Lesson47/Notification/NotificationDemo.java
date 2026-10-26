package Lesson47.Notification;

public class NotificationDemo {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification email = factory.createNotification("email");
        Notification sms = factory.createNotification("sms");
        Notification push = factory.createNotification("push");

        email.sendMessage("Salam! Bu email mesajidir.");
        sms.sendMessage("Salam! Bu SMS mesajidir.");
        push.sendMessage("Salam! Bu push mesajidir.");
    }
}
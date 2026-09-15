package Lesson35.Task4;

public class NotificationMain {
    public static void main(String[] args) {
        EmailNotification email = new EmailNotification();
        SmsNotification sms = new SmsNotification();

        email.send("Hello");
        email.log("Hello");

        sms.send("Hello");
        sms.log("Hello");
    }
}

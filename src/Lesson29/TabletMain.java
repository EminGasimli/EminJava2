package Lesson29;

public class TabletMain {
    public static void main(String[] args) {
        Tablet t1 = new Tablet("iPad");
        Tablet t2 = new Tablet("Galaxy Tab");
        Tablet t3 = new Tablet("Xiaomi Pad");
        t1.showInfo();
        t2.showInfo();
        t3.showInfo();
    }
}
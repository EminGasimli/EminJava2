package Lesson47;

public class AppConfigDemo {
    public static void main(String[] args) {
        AppConfig obj1 = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();

        obj1.setAppName("MyApp");
        obj1.setVersion("1.0");
        obj1.setLanguage("Azerbaijani");
        obj1.setMaintenanceMode(false);

        System.out.println("Eyni obyekt: " + (obj1 == obj2));
        System.out.println("App Name: " + obj2.getAppName());
        System.out.println("Version: " + obj2.getVersion());
        System.out.println("Language: " + obj2.getLanguage());
        System.out.println("Maintenance Mode: " + obj2.isMaintenanceMode());
    }
}
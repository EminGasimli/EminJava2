package Lesson29;

public class DatabaseConnectionMain {
        public static void main(String[] args) {
            DatabaseConnection db1 = new DatabaseConnection();
            DatabaseConnection db2 = new DatabaseConnection();
            DatabaseConnection db3 = new DatabaseConnection();
            System.out.println("Status: " + DatabaseConnection.dbStatus);
        }
}

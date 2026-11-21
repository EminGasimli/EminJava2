package Lesson54.Task3;

import java.time.LocalDateTime;
import java.util.List;

public class OrderMain {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.addOrder(new Order(1, "Laptop", 1500, LocalDateTime.now()));
        service.addOrder(new Order(2, "Mouse", 25, LocalDateTime.now().minusDays(2)));
        service.addOrder(new Order(3, "Keyboard", 80, LocalDateTime.now()));
        service.addOrder(new Order(4, "Monitor", 300, LocalDateTime.now().minusDays(5)));

        System.out.println("Today's Orders:");

        List<Order> todayOrders = service.getTodayOrders();

        for (Order order : todayOrders) {
            System.out.println(order);
        }

        System.out.println("\nTotal Price: " + service.getTotalPrice());
        System.out.println("\nOrders Between Dates:");

        List<Order> betweenOrders = service.getOrdersBetweenDates(LocalDateTime.now().minusDays(3), LocalDateTime.now());

        for (Order order : betweenOrders) {
            System.out.println(order);
        }
    }
}
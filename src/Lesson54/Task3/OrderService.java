package Lesson54.Task3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getTodayOrders() {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getOrderDate().toLocalDate().equals(LocalDate.now())) {
                result.add(order);
            }
        }
        return result;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Order order : orders) {
            total += order.getPrice();
        }
        return total;
    }

    public List<Order> getOrdersBetweenDates(LocalDateTime start, LocalDateTime end) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (!order.getOrderDate().isBefore(start) && !order.getOrderDate().isAfter(end)) {
                result.add(order);
            }
        }
        return result;
    }
}
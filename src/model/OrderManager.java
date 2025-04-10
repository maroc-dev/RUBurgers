package model;

public class OrderManager {
    private static OrderManager instance;
    private Order currentOrder;
    private static int orderCounter = 1;

    private OrderManager() {
        currentOrder = new Order(orderCounter++);
    }

    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void placeOrder() {
        currentOrder = new Order(orderCounter++);
    }
}
package ruburgers.ruburgers;

import java.util.ArrayList;

public class Order {
    private int number; //a unique integer to identify the order
    private ArrayList<MenuItem> items;

    public Order(int number) {
        this.number = number;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double totalPrice() {
        double total = 0;
        for (MenuItem item: items) {
            total += item.price();
        }
        return total;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order #" + number + ":\n");
        for (MenuItem item : items) {
            sb.append("- ").append(item.toString()).append("\n");
        }
        sb.append("Total: $").append(String.format("%.2f", totalPrice()));
        return sb.toString();
    }
}
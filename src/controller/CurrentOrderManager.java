package controller;

public class CurrentOrderManager {
    private static CurrentOrderManager instance;
    private CurrentOrder currentOrderController;

    private CurrentOrderManager() {}

    public static CurrentOrderManager getInstance() {
        if (instance == null) {
            instance = new CurrentOrderManager();
        }
        return instance;
    }

    public void setCurrentOrderController(CurrentOrder controller) {
        this.currentOrderController = controller;
    }

    public void updateCurrentOrderDisplay() {
        if (currentOrderController != null) {
            currentOrderController.updateOrderDisplay();
        }
    }
}
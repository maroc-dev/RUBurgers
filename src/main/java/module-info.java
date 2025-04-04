module ruburgers.ruburgers {
    requires javafx.controls;
    requires javafx.fxml;


    opens ruburgers.ruburgers to javafx.fxml;
    exports ruburgers.ruburgers;
}
module model {
    requires javafx.controls;
    requires javafx.fxml;

    requires junit;


    opens model to javafx.fxml;
    exports model;
    exports controller;
    opens controller to javafx.fxml;
}
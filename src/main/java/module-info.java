module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.presentation;
    opens com.example.demo.presentation to javafx.fxml;
    exports com.example.demo.entity;
    opens com.example.demo.entity to javafx.fxml;
}
module com.example.javafx3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.teatr to javafx.fxml;
    exports com.example.teatr;
}
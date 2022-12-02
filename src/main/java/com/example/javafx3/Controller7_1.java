package com.example.javafx3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller7_1 {

    @FXML
    private Button B1;

    @FXML
    void initialize() {
        B1.setOnAction(event -> {
            Window5_1 window51 = new Window5_1();
            try {
                window51.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
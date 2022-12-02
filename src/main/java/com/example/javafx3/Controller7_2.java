package com.example.javafx3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller7_2 {

    @FXML
    private Button B1;

    @FXML
    void initialize() {
        B1.setOnAction(event -> {
            Window5_2 window52 = new Window5_2();
            try {
                window52.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
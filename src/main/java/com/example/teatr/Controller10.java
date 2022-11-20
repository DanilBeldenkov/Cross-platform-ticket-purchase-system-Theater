package com.example.teatr;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller10 {

    @FXML
    private Button B1;

    @FXML
    void initialize() {
        B1.setOnAction(event -> {
            Okno8 okno8 = new Okno8();
            try {
                okno8.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
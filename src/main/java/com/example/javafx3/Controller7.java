package com.example.javafx3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
public class Controller7 {
    @FXML
    private Button B1;

    @FXML
    void initialize() {
        B1.setOnAction(e -> {
            B1.getScene().getWindow().hide();
        });
    }
}

package com.example.javafx3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller4_2 {

    @FXML
    private Button B1;

    @FXML
    private ImageView I1;

    @FXML
    private ImageView I2;

    @FXML
    private ButtonBar BB1;

    @FXML
    void initialize() {
        B1.setOnAction(e -> {
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

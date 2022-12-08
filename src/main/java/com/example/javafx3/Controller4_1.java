package com.example.javafx3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller4_1 {

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
        B1.setOnAction(event -> {
            Window5_1 window5_1 = new Window5_1();
            try {
                window5_1.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}

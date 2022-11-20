package com.example.teatr;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller5 {

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
            Okno7 okno7 = new Okno7();
            try {
                okno7.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}

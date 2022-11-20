package com.example.teatr;

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
    private Button B2;

    @FXML
    private ImageView I1;

    @FXML
    private ImageView I2;

    @FXML
    private TextArea TA1;

    @FXML
    void initialize() {
        B1.setOnAction(event -> {
            Okno9 okno9 = new Okno9();
            try {
                okno9.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        B2.setOnAction(event -> {
            Okno5 okno5 = new Okno5();
            try {
                okno5.start(new Stage());
                B2.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
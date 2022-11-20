package com.example.teatr;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller8 {

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
            Okno10 okno10 = new Okno10();
            try {
                okno10.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        B2.setOnAction(event -> {
            Okno6 okno6 = new Okno6();
            try {
                okno6.start(new Stage());
                B2.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
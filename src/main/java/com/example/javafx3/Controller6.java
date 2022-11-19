package com.example.javafx3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.FileOutputStream;
import java.io.IOException;

public class Controller6 {

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

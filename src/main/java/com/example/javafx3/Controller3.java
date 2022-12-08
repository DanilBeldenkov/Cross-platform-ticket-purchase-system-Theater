package com.example.javafx3;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller3 {

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button B3;

    @FXML
    private ImageView I1;

    @FXML
    private ImageView I2;

    @FXML
    private Label L1;

    @FXML
    void initialize() {

        B1.setOnAction(e -> {
            Window4_1 okno41 = new Window4_1();
            try {
                okno41.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Выбран жанр Драма");
        });

        B2.setOnAction(e -> {
            Window4_2 window42 = new Window4_2();
            try {
                window42.start(new Stage());
                B2.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Выбран жанр Комедия");
        });
    }
}


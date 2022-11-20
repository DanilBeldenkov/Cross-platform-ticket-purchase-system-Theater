package com.example.teatr;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller11 {

    @FXML
    private Button B1;

    @FXML
    private Button B2;


    @FXML
    void initialize(){
        B1.setOnAction(e -> {
            B1.getScene().getWindow().hide();
        });

        B2.setOnAction(e -> {
            Okno1 okno1 = new Okno1();
            try {
                okno1.start(new Stage());
                B2.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

}
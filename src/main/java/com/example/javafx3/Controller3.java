package com.example.javafx3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller3 {

    @FXML
    private Button B1;

    @FXML
    private ImageView I1;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    private Label L3;

    @FXML
    void initialize(){
            B1.setOnAction(e -> {
                    B1.getScene().getWindow().hide();
            });
        }

}
package com.example.javafx3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller6 {


    @FXML
    private Button B1;

    @FXML
    private Button B1_1;

    @FXML
    private Button B1_10;

    @FXML
    private Button B1_11;

    @FXML
    private Button B1_12;

    @FXML
    private Button B1_13;

    @FXML
    private Button B1_14;

    @FXML
    private Button B1_15;

    @FXML
    private Button B1_2;

    @FXML
    private Button B1_3;

    @FXML
    private Button B1_4;

    @FXML
    private Button B1_5;

    @FXML
    private Button B1_6;

    @FXML
    private Button B1_7;

    @FXML
    private Button B1_8;

    @FXML
    private Button B1_9;

    @FXML
    private Button B2;

    @FXML
    private Button B2_1;

    @FXML
    private Button B2_10;

    @FXML
    private Button B2_11;

    @FXML
    private Button B2_12;

    @FXML
    private Button B2_13;

    @FXML
    private Button B2_14;

    @FXML
    private Button B2_15;

    @FXML
    private Button B2_2;

    @FXML
    private Button B2_3;

    @FXML
    private Button B2_4;

    @FXML
    private Button B2_5;

    @FXML
    private Button B2_6;

    @FXML
    private Button B2_7;

    @FXML
    private Button B2_8;

    @FXML
    private Button B2_9;

    @FXML
    private Button B3;

    @FXML
    private Button B3_1;

    @FXML
    private Button B3_10;

    @FXML
    private Button B3_11;

    @FXML
    private Button B3_12;

    @FXML
    private Button B3_13;

    @FXML
    private Button B3_14;

    @FXML
    private Button B3_15;

    @FXML
    private Button B3_2;

    @FXML
    private Button B3_3;

    @FXML
    private Button B3_4;

    @FXML
    private Button B3_5;

    @FXML
    private Button B3_6;

    @FXML
    private Button B3_7;

    @FXML
    private Button B3_8;

    @FXML
    private Button B3_9;

    @FXML
    private ImageView I1;

    @FXML
    private ImageView I2;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    void initialize() {
        B1.setOnAction(e -> {
            Window7 window7 = new Window7();
            try {
                window7.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            Window7_1 window7_1 = new Window7_1();
            try {
                window7_1.start(new Stage());
                B1.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        B2.setOnAction(event -> {
            Window5_1 window5_1 = new Window5_1();
            try {
                window5_1.start(new Stage());
                B2.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        B3.setOnAction(e -> {
            L1.setText("Места");
            L2.setText("забронированы");
        });

        B1_1.setOnMousePressed(mouseEvent -> {
            B1_1.setStyle("-fx-background-color: green");
        });
        B1_1.setOnAction(actionEvent -> {
            B1_1.setOnMousePressed(event -> {
                B1_1.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_2.setOnMousePressed(mouseEvent -> {
            B1_2.setStyle("-fx-background-color: green");
        });
        B1_2.setOnAction(actionEvent -> {
            B1_2.setOnMousePressed(event -> {
                B1_2.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_3.setOnMousePressed(mouseEvent -> {
            B1_3.setStyle("-fx-background-color: green");
        });
        B1_3.setOnAction(actionEvent -> {
            B1_3.setOnMousePressed(event -> {
                B1_3.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_4.setOnMousePressed(mouseEvent -> {
            B1_4.setStyle("-fx-background-color: green");
        });
        B1_4.setOnAction(actionEvent -> {
            B1_4.setOnMousePressed(event -> {
                B1_4.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_5.setOnMousePressed(mouseEvent -> {
            B1_5.setStyle("-fx-background-color: green");
        });
        B1_5.setOnAction(actionEvent -> {
            B1_5.setOnMousePressed(event -> {
                B1_5.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_6.setOnMousePressed(mouseEvent -> {
            B1_6.setStyle("-fx-background-color: green");
        });
        B1_6.setOnAction(actionEvent -> {
            B1_6.setOnMousePressed(event -> {
                B1_6.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_7.setOnMousePressed(mouseEvent -> {
            B1_7.setStyle("-fx-background-color: green");
        });
        B1_7.setOnAction(actionEvent -> {
            B1_7.setOnMousePressed(event -> {
                B1_7.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_8.setOnMousePressed(mouseEvent -> {
            B1_8.setStyle("-fx-background-color: green");
        });
        B1_8.setOnAction(actionEvent -> {
            B1_8.setOnMousePressed(event -> {
                B1_8.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_9.setOnMousePressed(mouseEvent -> {
            B1_9.setStyle("-fx-background-color: green");
        });
        B1_9.setOnAction(actionEvent -> {
            B1_9.setOnMousePressed(event -> {
                B1_9.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_10.setOnMousePressed(mouseEvent -> {
            B1_10.setStyle("-fx-background-color: green");
        });
        B1_10.setOnAction(actionEvent -> {
            B1_10.setOnMousePressed(event -> {
                B1_10.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_11.setOnMousePressed(mouseEvent -> {
            B1_11.setStyle("-fx-background-color: green");
        });
        B1_11.setOnAction(actionEvent -> {
            B1_11.setOnMousePressed(event -> {
                B1_11.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_12.setOnMousePressed(mouseEvent -> {
            B1_12.setStyle("-fx-background-color: green");
        });
        B1_12.setOnAction(actionEvent -> {
            B1_12.setOnMousePressed(event -> {
                B1_12.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_13.setOnMousePressed(mouseEvent -> {
            B1_13.setStyle("-fx-background-color: green");
        });
        B1_13.setOnAction(actionEvent -> {
            B1_13.setOnMousePressed(event -> {
                B1_13.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_14.setOnMousePressed(mouseEvent -> {
            B1_14.setStyle("-fx-background-color: green");
        });
        B1_14.setOnAction(actionEvent -> {
            B1_14.setOnMousePressed(event -> {
                B1_14.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B1_15.setOnMousePressed(mouseEvent -> {
            B1_15.setStyle("-fx-background-color: green");
        });
        B1_15.setOnAction(actionEvent -> {
            B1_15.setOnMousePressed(event -> {
                B1_15.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_1.setOnMousePressed(mouseEvent -> {
            B2_1.setStyle("-fx-background-color: green");
        });
        B2_1.setOnAction(actionEvent -> {
            B2_1.setOnMousePressed(event -> {
                B2_1.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_2.setOnMousePressed(mouseEvent -> {
            B2_2.setStyle("-fx-background-color: green");
        });
        B2_2.setOnAction(actionEvent -> {
            B2_2.setOnMousePressed(event -> {
                B2_2.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_3.setOnMousePressed(mouseEvent -> {
            B2_3.setStyle("-fx-background-color: green");
        });
        B2_3.setOnAction(actionEvent -> {
            B2_3.setOnMousePressed(event -> {
                B2_3.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_4.setOnMousePressed(mouseEvent -> {
            B2_4.setStyle("-fx-background-color: green");
        });
        B2_4.setOnAction(actionEvent -> {
            B2_4.setOnMousePressed(event -> {
                B2_4.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_5.setOnMousePressed(mouseEvent -> {
            B2_5.setStyle("-fx-background-color: green");
        });
        B2_5.setOnAction(actionEvent -> {
            B2_5.setOnMousePressed(event -> {
                B2_5.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_6.setOnMousePressed(mouseEvent -> {
            B2_6.setStyle("-fx-background-color: green");
        });
        B2_6.setOnAction(actionEvent -> {
            B2_6.setOnMousePressed(event -> {
                B2_6.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_7.setOnMousePressed(mouseEvent -> {
            B2_7.setStyle("-fx-background-color: green");
        });
        B2_7.setOnAction(actionEvent -> {
            B2_7.setOnMousePressed(event -> {
                B2_7.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_8.setOnMousePressed(mouseEvent -> {
            B2_8.setStyle("-fx-background-color: green");
        });
        B2_8.setOnAction(actionEvent -> {
            B2_8.setOnMousePressed(event -> {
                B2_8.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_9.setOnMousePressed(mouseEvent -> {
            B2_9.setStyle("-fx-background-color: green");
        });
        B2_9.setOnAction(actionEvent -> {
            B2_9.setOnMousePressed(event -> {
                B2_9.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_10.setOnMousePressed(mouseEvent -> {
            B2_10.setStyle("-fx-background-color: green");
        });
        B2_10.setOnAction(actionEvent -> {
            B2_10.setOnMousePressed(event -> {
                B2_10.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_11.setOnMousePressed(mouseEvent -> {
            B2_11.setStyle("-fx-background-color: green");
        });
        B2_11.setOnAction(actionEvent -> {
            B2_11.setOnMousePressed(event -> {
                B2_11.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_12.setOnMousePressed(mouseEvent -> {
            B2_12.setStyle("-fx-background-color: green");
        });
        B2_12.setOnAction(actionEvent -> {
            B2_12.setOnMousePressed(event -> {
                B2_12.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_13.setOnMousePressed(mouseEvent -> {
            B2_13.setStyle("-fx-background-color: green");
        });
        B2_13.setOnAction(actionEvent -> {
            B2_13.setOnMousePressed(event -> {
                B2_13.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_14.setOnMousePressed(mouseEvent -> {
            B2_14.setStyle("-fx-background-color: green");
        });
        B2_14.setOnAction(actionEvent -> {
            B2_14.setOnMousePressed(event -> {
                B2_14.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B2_15.setOnMousePressed(mouseEvent -> {
            B2_15.setStyle("-fx-background-color: green");
        });
        B2_15.setOnAction(actionEvent -> {
            B2_15.setOnMousePressed(event -> {
                B2_15.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_1.setOnMousePressed(mouseEvent -> {
            B3_1.setStyle("-fx-background-color: green");
        });
        B3_1.setOnAction(actionEvent -> {
            B3_1.setOnMousePressed(event ->{
                B3_1.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_2.setOnMousePressed(mouseEvent -> {
            B3_2.setStyle("-fx-background-color: green");
        });
        B3_2.setOnAction(actionEvent -> {
            B3_2.setOnMousePressed(event ->{
                B3_2.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_3.setOnMousePressed(mouseEvent -> {
            B3_3.setStyle("-fx-background-color: green");
        });
        B3_3.setOnAction(actionEvent -> {
            B3_3.setOnMousePressed(event ->{
                B3_3.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_4.setOnMousePressed(mouseEvent -> {
            B3_4.setStyle("-fx-background-color: green");
        });
        B3_4.setOnAction(actionEvent -> {
            B3_4.setOnMousePressed(event ->{
                B3_4.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_5.setOnMousePressed(mouseEvent -> {
            B3_5.setStyle("-fx-background-color: green");
        });
        B3_5.setOnAction(actionEvent -> {
            B3_5.setOnMousePressed(event ->{
                B3_5.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_6.setOnMousePressed(mouseEvent -> {
            B3_6.setStyle("-fx-background-color: green");
        });
        B3_6.setOnAction(actionEvent -> {
            B3_6.setOnMousePressed(event ->{
                B3_6.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_7.setOnMousePressed(mouseEvent -> {
            B3_7.setStyle("-fx-background-color: green");
        });
        B3_7.setOnAction(actionEvent -> {
            B3_7.setOnMousePressed(event ->{
                B3_7.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_8.setOnMousePressed(mouseEvent -> {
            B3_8.setStyle("-fx-background-color: green");
        });
        B3_8.setOnAction(actionEvent -> {
            B3_8.setOnMousePressed(event ->{
                B3_8.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_9.setOnMousePressed(mouseEvent -> {
            B3_9.setStyle("-fx-background-color: green");
        });
        B3_9.setOnAction(actionEvent -> {
            B3_9.setOnMousePressed(event ->{
                B3_9.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_10.setOnMousePressed(mouseEvent -> {
            B3_10.setStyle("-fx-background-color: green");
        });
        B3_10.setOnAction(actionEvent -> {
            B3_10.setOnMousePressed(event ->{
                B3_10.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_11.setOnMousePressed(mouseEvent -> {
            B3_11.setStyle("-fx-background-color: green");
        });
        B3_11.setOnAction(actionEvent -> {
            B3_11.setOnMousePressed(event ->{
                B3_11.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_12.setOnMousePressed(mouseEvent -> {
            B3_12.setStyle("-fx-background-color: green");
        });
        B3_12.setOnAction(actionEvent -> {
            B3_12.setOnMousePressed(event ->{
                B3_12.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_13.setOnMousePressed(mouseEvent -> {
            B3_13.setStyle("-fx-background-color: green");
        });
        B3_13.setOnAction(actionEvent -> {
            B3_13.setOnMousePressed(event ->{
                B3_13.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_14.setOnMousePressed(mouseEvent -> {
            B3_14.setStyle("-fx-background-color: green");
        });
        B3_14.setOnAction(actionEvent -> {
            B3_14.setOnMousePressed(event ->{
                B3_14.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });

        B3_15.setOnMousePressed(mouseEvent -> {
            B3_15.setStyle("-fx-background-color: green");
        });
        B3_15.setOnAction(actionEvent -> {
            B3_15.setOnMousePressed(event ->{
                B3_15.setStyle("-fx-background-color: red");
            });
            L1.setText("Нажмите ещё раз,");
            L2.setText("чтобы забронировать");
        });
    }
}

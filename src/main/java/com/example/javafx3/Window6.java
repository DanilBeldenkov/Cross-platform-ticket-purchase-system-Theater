package com.example.javafx3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Window6 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Window6.class.getResource("Window6.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 400);
        stage.setTitle("Выберите место");
        stage.setScene(scene);
        stage.show();
    }
    private final List<Button> list = new ArrayList<>();
    public static void main(String[] args) {
        launch();
    }

    private void addEvents() {

        for (int i=0; i<list.size(); i++) {
            int finalI = i;
            list.get(i).setOnAction(e -> {
                list.get(finalI).setStyle("-fx-background-color: green");
            });
        }
    }
}
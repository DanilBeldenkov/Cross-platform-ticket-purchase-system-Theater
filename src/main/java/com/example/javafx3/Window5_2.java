package com.example.javafx3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Window5_2 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Window5_2.class.getResource("Window5_2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 400);
        stage.setTitle("Комедия");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
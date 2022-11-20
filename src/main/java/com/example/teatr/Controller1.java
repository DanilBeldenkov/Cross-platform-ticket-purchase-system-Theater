package com.example.teatr;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Controller1 {

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
    private ImageView I3;

    @FXML
    private Label L1;

    @FXML
    private TextField TF1;

    @FXML
    private PasswordField PF1;


    @FXML
    void initialize() {
        B3.setOnAction(e -> {
            Okno11 okno11 = new Okno11();
            try {
                okno11.start(new Stage());
                B3.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        B1.setOnAction(event -> {
            System.out.println("Логин: " + TF1.getText());
            System.out.println("Пароль: " + PF1.getText());

            try {
                BufferedReader reader1 = new BufferedReader(new FileReader("D:\\Projects\\IntelliJIDEAProjects\\JavaFX3\\src\\inputlogin.txt")) {
                };
                String line1;
                while ((line1 = reader1.readLine()) != null) {
                    if (line1.equals(TF1.getText().trim())) {
                        try {
                            Okno4 okno4 = new Okno4();
                            try {
                                okno4.start(new Stage());
                                B1.getScene().getWindow().hide();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("Логин правильный");
                    } else {
                        Okno3 okno3 = new Okno3();
                        try {
                            okno3.start(new Stage());
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                        System.out.println("Логин неправильный");
                    }
                }

                BufferedReader reader2 = new BufferedReader(new FileReader("D:\\Projects\\IntelliJIDEAProjects\\JavaFX3\\src\\inputpass.txt")) {
                };
                String line2;
                while ((line2 = reader2.readLine()) != null) {
                    if (line2.equals(PF1.getText().trim())) {
                        try {
                            Okno4 okno4 = new Okno4();
                            try {
                                okno4.start(new Stage());
                                B1.getScene().getWindow().hide();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("Пароль правильный");
                    } else {
                        Okno3 okno3 = new Okno3();
                        try {
                            okno3.start(new Stage());
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                        System.out.println("Пароль неправильный");
                    }
                }

            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        B2.setOnAction(e -> {
            Okno2 okno2 = new Okno2();
            try {
                okno2.start(new Stage());
                B2.getScene().getWindow().hide();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

}
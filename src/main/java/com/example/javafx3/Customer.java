package com.example.javafx3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Customer {
    private String name;
    private String age;
    private int number;

    public Customer(String name, String age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }


    public String getName() {
        return name ;
    }

    public void setName(String name ) {
        this.name = name;
    }

    public String getAge() {
        return age ;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}


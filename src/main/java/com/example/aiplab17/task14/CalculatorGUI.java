package com.example.aiplab17.task14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorGUI extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("task14.fxml"));
        stage.setTitle("Sum of two digits");
        stage.setScene(new Scene(root, 600, 300
        ));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

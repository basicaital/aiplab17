package com.example.aiplab17.task15;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("task15.fxml"));
        primaryStage.setTitle("Counter App");
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }
}

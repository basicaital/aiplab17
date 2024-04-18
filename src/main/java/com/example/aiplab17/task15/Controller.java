package com.example.aiplab17.task15;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button Clear;
    @FXML
    private TextField Number;

    private int number = 0;

    public void initialize() {
        updateNumberField();
    }

    public void handleIncrement(ActionEvent actionEvent) {
        if (number < 3) {
            number++;
            updateNumberField();
        }
    }

    public void handleDecrement(ActionEvent actionEvent) {
        if (number > -5) {
            number--;
            updateNumberField();
        }
    }

    public void handleClose(ActionEvent actionEvent) {
        System.exit(0);
    }

    private void updateNumberField() {
        Number.setText(Integer.toString(number));
    }
    @FXML
    private void clearNumberField(ActionEvent clearing){
        Number.setText(Integer.toString(number = 0));
    }
}

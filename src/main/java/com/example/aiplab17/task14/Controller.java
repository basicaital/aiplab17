package com.example.aiplab17.task14;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button buttonCalculate;
    @FXML
    private Button buttonClear;
    @FXML
    private Label labelA;
    @FXML
    private Label labelB;
    @FXML
    private Label labelSum;
    @FXML
    private TextField TextA;
    @FXML
    private TextField TextB;
    @FXML
    private TextField TextSum;
    @FXML
    private void clickCalculate(ActionEvent calculating){
        try {
            double num1 = Double.parseDouble(TextA.getText());
            double num2 = Double.parseDouble(TextB.getText());
            double result = num1+num2;
            TextSum.setText(Double.toString(result));
        }
        catch (NumberFormatException exception){
        TextSum.setText("Ошибка! Введите число");
        }
    }
    @FXML
    private void clickClear(ActionEvent clearing){
        TextA.setText("");
        TextB.setText("");
        TextSum.setText("");
    }
}

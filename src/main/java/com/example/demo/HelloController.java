package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label result;

    private boolean start = true;
    private double number1;
    private double number2;
    String operator = "";

    @FXML
    public void clear(ActionEvent event) {
        result.setText("");
        operator = "";
        start = true;
    }
    @FXML
    public void processNumber(ActionEvent event) {
        if (start) {
            result.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();
        result.setText(result.getText() + value);
    }

    @FXML
    public void proccesBinaryOperator(ActionEvent event) {
        String currentOperator = ((Button) event.getSource()).getText();
        if (!currentOperator.equals("=")) {
            if (!operator.isEmpty()) {
                return;
            }
            operator = currentOperator;
            number1 = Double.parseDouble(result.getText());
            result.setText("");
        } else {
            if (operator.isEmpty()) {
                return;
            }
            number2 = Double.parseDouble(result.getText());
            double output = Calculation.calculatorBinaryDouble(number1, number2, operator);
            result.setText(String.valueOf(output));
            operator = "";
        }
    }

    @FXML
    public void proccesUnaryOperator(ActionEvent event) {
        String currentOperator = ((Button) event.getSource()).getText();
        if (!operator.isEmpty()) {
            return;
        }
        operator = currentOperator;
        number1 = Double.parseDouble(result.getText());
        result.setText("");
        double output = Calculation.calculatorUnaryDouble(number1,operator);
        result.setText(String.valueOf(output));
        operator = "";
    }
}
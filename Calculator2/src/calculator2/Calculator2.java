package calculator2;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Calculator2 extends Application {

    static TextField textField = new TextField();
    double num1 = 0;
    double num2 = 0;
    String operation;

    @Override
    public void start(final Stage primaryStage) {

        Scene scene;
        scene = new Scene(addGridPane());
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent esc) {
                if (esc.getCode() == KeyCode.ESCAPE) {
                    primaryStage.close();
                }
            }
        });
        
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Calculator2.class.getResource("calculator2.css").toExternalForm());
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    public GridPane addGridPane() {
        GridPane grid = new GridPane();
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button button1 = createButton("1");
        grid.add(button1, 0, 1);
        Button button2 = createButton("2");
        grid.add(button2, 1, 1);
        Button button3 = createButton("3");
        grid.add(button3, 2, 1);
        Button button4 = createButton("4");
        grid.add(button4, 0, 2);
        Button button5 = createButton("5");
        grid.add(button5, 1, 2);
        Button button6 = createButton("6");
        grid.add(button6, 2, 2);
        Button button7 = createButton("7");
        grid.add(button7, 0, 3);
        Button button8 = createButton("8");
        grid.add(button8, 1, 3);
        Button button9 = createButton("9");
        grid.add(button9, 2, 3);
        Button button0 = createButton("0");
        grid.add(button0, 1, 4);
        
        Button buttonDecimal = createButton(".");
        grid.add(buttonDecimal, 0, 4);
        Button buttonEquals = createButton("=");
        grid.add(buttonEquals, 5, 4);
        Button buttonClear = createButton("c");
        grid.add(buttonClear, 2, 4);

        Button buttonAdd = opButton("+");
        grid.add(buttonAdd, 3, 1);
        Button buttonSubtract = opButton("-");
        grid.add(buttonSubtract, 3, 2);
        Button buttonMultiply = opButton("*");
        grid.add(buttonMultiply, 3, 3);
        Button buttonDivide = opButton("/");
        grid.add(buttonDivide, 3, 4);
        
        Button buttonSin = opButton("sin");
        grid.add(buttonSin, 4, 1);
        Button buttonCos = opButton("cos");
        grid.add(buttonCos, 4, 2);
        Button buttonTan = opButton("tan");
        grid.add(buttonTan, 4, 3);
        
        Button buttonArcsin = opButton("arcsin");
        grid.add(buttonArcsin, 5, 1);
        Button buttonArccos = opButton("arccos");
        grid.add(buttonArccos, 5, 2);
        Button buttonArctan = opButton("arctan");
        grid.add(buttonArctan, 5, 3);
        
        Button buttonExp = opButton("^");
        grid.add(buttonExp, 4, 4);

        buttonEquals.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {

                if (operation.equals("+")) {
                    num2 = Double.valueOf(textField.getText());
                    textField.setText((num1 + num2) + "");
                    operation = "";
                }
                if (operation.equals("-")) {
                    num2 = Double.valueOf(textField.getText());
                    textField.setText((num1 - num2) + "");
                    operation = "";
                }
                if (operation.equals("*")) {
                    num2 = Double.valueOf(textField.getText());
                    textField.setText((num1 * num2) + "");
                    operation = "";
                }
                if (operation.equals("/")) {
                    num2 = Double.valueOf(textField.getText());
                    textField.setText((num1 / num2) + "");
                    operation = "";
                }
                if (operation.equals("sin")) {
                    textField.setText(Math.sin(num1) + "");
                    operation = "";
                }
                if (operation.equals("cos")) {
                    textField.setText(Math.cos(num1) + "");
                    operation = "";
                }
                if (operation.equals("tan")) {
                    textField.setText(Math.tan(num1) + "");
                    operation = "";
                }
                if (operation.equals("arcsin")) {
                    textField.setText(Math.asin(num1) + "");
                    operation = "";
                }
                if (operation.equals("arccos")) {
                    textField.setText(Math.acos(num1) + "");
                    operation = "";
                }
                if (operation.equals("arctan")) {
                    textField.setText(Math.atan(num1) + "");
                    operation = "";
                }
                if (operation.equals("^")) {
                    num2 = Double.valueOf(textField.getText());
                    textField.setText(Math.pow(num1, num2) + "");
                    operation = "";
                }
            }
        });
        
        buttonClear.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                num1 = 0;
                num2 = 0;
                operation = "";
                textField.setText("");
            }
        });
        
        grid.add(textField, 0, 0);
        grid.setColumnSpan(textField, 6);

        return grid;
    }

    private Button createButton(final String text) {
        Button button = new Button(text);
        button.setEffect(new DropShadow());
        button.setStyle("-fx-font: 20 arial; -fx-base: #c0fe56;");
        button.setMaxWidth(Double.MAX_VALUE);
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                textField.setText(textField.getText() + text);

            }
        });
        
        return button;
    }

    private Button opButton(final String op) {
        Button opButton = new Button(op);
        opButton.setEffect(new DropShadow());
        opButton.setStyle("-fx-font: 20 arial; -fx-base: #c0fe56;");
        opButton.setMaxWidth(Double.MAX_VALUE);
        opButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                num1 = Double.valueOf(textField.getText());
                textField.setText("");
                operation = op;
            }
        });
        
        return opButton;
    }
}

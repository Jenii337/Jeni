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
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Calculator2 extends Application {

    static TextField textField = new TextField();
    static String s = "";
    double num1 = 0;
    double num2 = 0;
    String operation;
    @Override
    public void start(Stage primaryStage) {
        BorderPane border = new BorderPane();

        border.setCenter(addGridPane());

        Scene scene;
        scene = new Scene(addGridPane());
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Calculator2.class.getResource("calculator2.css").toExternalForm());
        primaryStage.show();
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
        Button buttonAdd = createButton("+");
        grid.add(buttonAdd, 3, 1);
        Button buttonSubtract = createButton("-");
        grid.add(buttonSubtract, 3, 2);
        Button buttonMultiply = createButton("*");
        grid.add(buttonMultiply, 3, 3);
        Button buttonDivide = createButton("/");
        grid.add(buttonDivide, 3, 4);
        Button buttonEquals = createButton("=");
        grid.add(buttonEquals, 3, 5);


        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                s += "1";
                textField.setText("1");
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                s += "2";
                textField.setText("2");
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                s += "3";
                textField.setText("3");
            }
        });
        button4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                s += "4";
                textField.setText("4");
            }
        });
        button5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                s += "5";
                textField.setText("5");
            }
        });
        button6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                s += "6";
                textField.setText("6");
            }
        });
        button7.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                s += "7";
                textField.setText("7");
            }
        });
        button8.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                s += "8";
                textField.setText("8");
            }
        });
        button9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                s += "9";
                textField.setText("8");
            }
        });
        button0.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                s += "0";
                textField.setText("0");
            }
        });
        buttonAdd.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                num1 = Double.valueOf(textField.getText());
                textField.setText("");
                operation ="+";            }
        });
        buttonSubtract.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                num1 = Double.valueOf(textField.getText());
                textField.setText("");
                operation ="-"; 
            }
        });
        buttonMultiply.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                num1 = Double.valueOf(textField.getText());
                textField.setText("");
                operation ="*"; 
            }
        });
        buttonDivide.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                num1 = Double.valueOf(textField.getText());
                textField.setText("");
                operation ="/"; 
            }
        });
        buttonEquals.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                if (operation.equals("+")){
                    num2 = Double.valueOf(textField.getText());
                    textField.setText((num1+num2)+"");
                    operation =""; 
                }
                if (operation.equals("-")){
                    num2 = Double.valueOf(textField.getText());
                    textField.setText((num1-num2)+"");
                    operation ="";
                }
                if (operation.equals("*")){
                    num2 = Double.valueOf(textField.getText());
                    textField.setText((num1*num2)+"");
                    operation ="";
                }
                if (operation.equals("/")){
                    num2 = Double.valueOf(textField.getText());
                    textField.setText((num1/num2)+"");
                    operation ="";
                }
            }
        });

        grid.add(textField, 0, 0);

        return grid;
    }

    private Button createButton(final String text) {
        Button button = new Button(text);
        button.setEffect(new DropShadow());
        button.setStyle("-fx-font: 20 arial; -fx-base: #c0fe56;");
        button.setMaxWidth(Double.MAX_VALUE);
        return button;
    }
    /*public HBox addHBox() {
     HBox hbox = new HBox();
     hbox.setPadding(new Insets(15, 12, 15, 12));
     hbox.setSpacing(10);
     TextField textField = new TextField();
     hbox.getChildren().add(textField);
            
     return hbox;
     }*/
}

package calculator2;

import java.util.Scanner;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.stage.Stage;


public class Calculator2 extends Application { 

    @Override
    public void start(Stage primaryStage) {
        
        Scene scene;
        scene = new Scene(addGridPane());
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Calculator2.class.getResource("calculator2.css").toExternalForm());
        primaryStage.show();     }    

    public GridPane addGridPane() {
        GridPane grid = new GridPane();
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(25, 25, 25, 25));        
         
        Button button1 = new Button("1");
        grid.add(button1, 0, 0);
        button1.setEffect(new DropShadow());
        button1.setMaxWidth(Double.MAX_VALUE);
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("1");
            }
        });

        Button button2 = new Button("2");
        grid.add(button2, 1, 0);
        button2.setEffect(new DropShadow());
        button2.setMaxWidth(Double.MAX_VALUE);
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("2");
            }
        });
        
        Button button3 = new Button("3");
        grid.add(button3, 2, 0);
        button3.setEffect(new DropShadow());
        button3.setMaxWidth(Double.MAX_VALUE);       
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("3");
            }
        });

        Button button4 = new Button("4");
        grid.add(button4, 0, 1);
        button4.setEffect(new DropShadow());
        button4.setMaxWidth(Double.MAX_VALUE);
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("4");
            }
        });


        Button button5 = new Button("5");
        grid.add(button5, 1, 1);
        button5.setEffect(new DropShadow());
        button5.setMaxWidth(Double.MAX_VALUE);
        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("5");
            }
        });

        Button button6 = new Button("6");
        grid.add(button6, 2, 1);
        button6.setEffect(new DropShadow());
        button6.setMaxWidth(Double.MAX_VALUE);
        button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("6");
            }
        });

        Button button7 = new Button("7");
        grid.add(button7, 0, 2);
        button7.setEffect(new DropShadow());
        button7.setMaxWidth(Double.MAX_VALUE);
        button7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("7");
            }
        });

        Button button8 = new Button("8");
        grid.add(button8, 1, 2); 
        button8.setEffect(new DropShadow());
        button8.setMaxWidth(Double.MAX_VALUE);
        button8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("8");
            }
        });

        Button button9 = new Button("9");
        grid.add(button9, 2, 2);
        button9.setEffect(new DropShadow());
        button9.setMaxWidth(Double.MAX_VALUE);
        button9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("9");
            }
        });

        Button button0 = new Button("0");
        grid.add(button0, 1, 3);
        button0.setEffect(new DropShadow());
        button0.setMaxWidth(Double.MAX_VALUE);
        button0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("0");
            }
        });

        Button buttonAdd = new Button("+");
        grid.add(buttonAdd, 3, 0);
        buttonAdd.setEffect(new DropShadow());
        buttonAdd.setStyle("-fx-font: 20 arial; -fx-base: #c0fe56;");
        buttonAdd.setMaxWidth(Double.MAX_VALUE);
        buttonAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("+");
            }
        });

        Button buttonSubtract = new Button("-");
        grid.add(buttonSubtract, 3, 1);
        buttonSubtract.setEffect(new DropShadow());
        buttonSubtract.setStyle("-fx-font: 20 arial; -fx-base: #c0fe56;");
        buttonSubtract.setMaxWidth(Double.MAX_VALUE);
        buttonSubtract.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("-");
            }
        });
        
        Button buttonMultiply = new Button("*");
        grid.add(buttonMultiply, 3, 2);
        buttonMultiply.setEffect(new DropShadow());
        buttonMultiply.setStyle("-fx-font: 20 arial; -fx-base: #c0fe56;");
        buttonMultiply.setMaxWidth(Double.MAX_VALUE);
        buttonMultiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("*");
            }
        });
        
        Button buttonDivide = new Button("/");
        grid.add(buttonDivide, 3, 3);
        buttonDivide.setEffect(new DropShadow());
        buttonDivide.setStyle("-fx-font: 20 arial; -fx-base: #c0fe56;");
        buttonDivide.setMaxWidth(Double.MAX_VALUE);
        buttonDivide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                System.out.print("/");
            }
        });
        
        Button buttonEquals = new Button("=");
        grid.add(buttonEquals, 3, 4);
        buttonEquals.setEffect(new DropShadow());
        buttonEquals.setStyle("-fx-font: 20 arial; -fx-base: #c0fe56;");
        buttonEquals.setMaxWidth(Double.MAX_VALUE);
        buttonEquals.setOnAction(new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent t) {
                System.out.print("=");
            }
        });
        
        //grid.setGridLinesVisible(true);
        return grid;       
    }
    
    public static void main(String[] args) {
        
    }
}
    
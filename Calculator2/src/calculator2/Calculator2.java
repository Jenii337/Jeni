package calculator2;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Calculator2 extends Application {
        private static final Color color = Color.web("#f2660f");

public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        
        Scene scene;
        scene = new Scene(addGridPane());
        primaryStage.setScene(scene);
        primaryStage.show();     }    

    public GridPane addGridPane() {
        GridPane grid = new GridPane();
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setPadding(new Insets(25, 25, 25, 25));
         
        Button button1 = new Button("1");
        grid.add(button1, 0, 0);
        button1.setEffect(new DropShadow());
        button1.setStyle("-fx-font: 20 arial; -fx-base: #64c2f8;");
        button1.setTextFill(color);

        Button button2 = new Button("2");
        grid.add(button2, 1, 0);
        button2.setEffect(new DropShadow());
        button2.setStyle("-fx-font: 20 arial; -fx-base: #64c2f8;");
        button2.setTextFill(color);
        
        Button button3 = new Button("3");
        grid.add(button3, 2, 0);
        button3.setEffect(new DropShadow());
        button3.setStyle("-fx-font: 20 arial; -fx-base: #64c2f8;");
        button3.setTextFill(color);

        Button button4 = new Button("4");
        grid.add(button4, 0, 1);
        button4.setEffect(new DropShadow());
        button4.setStyle("-fx-font: 20 arial; -fx-base: #64c2f8;");
        button4.setTextFill(color);

        Button button5 = new Button("5");
        grid.add(button5, 1, 1);
        button5.setEffect(new DropShadow());
        button5.setStyle("-fx-font: 20 arial; -fx-base: #64c2f8;");
        button5.setTextFill(color);

        Button button6 = new Button("6");
        grid.add(button6, 2, 1);
        button6.setEffect(new DropShadow());
        button6.setStyle("-fx-font: 20 arial; -fx-base: #64c2f8;");
        button6.setTextFill(color);

        Button button7 = new Button("7");
        grid.add(button7, 0, 2);
        button7.setEffect(new DropShadow());
        button7.setStyle("-fx-font: 20 arial; -fx-base: #64c2f8;");
        button7.setTextFill(color);

        Button button8 = new Button("8");
        grid.add(button8, 1, 2);
        button8.setEffect(new DropShadow());
        button8.setStyle("-fx-font: 20 arial; -fx-base: #64c2f8;");
        button8.setTextFill(color);

        Button button9 = new Button("9");
        grid.add(button9, 2, 2);
        button9.setEffect(new DropShadow());
        button9.setStyle("-fx-font: 20 arial; -fx-base: #64c2f8;");
        button9.setTextFill(color);

        Button button0 = new Button("0");
        grid.add(button0, 1, 3);
        button0.setEffect(new DropShadow());
        button0.setStyle("-fx-font: 20 arial; -fx-base: #64c2f8;");
        button0.setTextFill(color);

        Button buttonAdd = new Button("+");
        grid.add(buttonAdd, 3, 0);
        buttonAdd.setEffect(new DropShadow());
        buttonAdd.setStyle("-fx-font: 20 arial; -fx-base: #c0fe56;");
                buttonAdd.setMaxWidth(Double.MAX_VALUE);

        
        Button buttonSubtract = new Button("-");
        grid.add(buttonSubtract, 3, 1);
        buttonSubtract.setEffect(new DropShadow());
        buttonSubtract.setStyle("-fx-font: 20 arial; -fx-base: #c0fe56;");
                buttonSubtract.setMaxWidth(Double.MAX_VALUE);

        
        Button buttonMultiply = new Button("*");
        grid.add(buttonMultiply, 3, 2);
        buttonMultiply.setEffect(new DropShadow());
        buttonMultiply.setStyle("-fx-font: 20 arial; -fx-base: #c0fe56;");
                buttonMultiply.setMaxWidth(Double.MAX_VALUE);

        
        Button buttonDivide = new Button("/");
        grid.add(buttonDivide, 3, 3);
        buttonDivide.setEffect(new DropShadow());
        buttonDivide.setStyle("-fx-font: 20 arial; -fx-base: #c0fe56;");
                buttonDivide.setMaxWidth(Double.MAX_VALUE);


        //grid.setGridLinesVisible(true);
        return grid;
        
        
    }
}
package calculator;

import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Frame;

public class JavaApplication4 extends Frame {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //prompts user to enter first number
        
        System.out.println("enter first number");
        
        double num1 = scanner.nextDouble();
        
        //prompts user to enter an operation
        
        System.out.println("enter operation");
 
        String operation = scanner.next();
        
        //calculates trig functions
        
        double sin = Math.sin(num1);
        double cos = Math.cos(num1);
        double tan = Math.tan(num1);

        //calculates inverse trig functions
        
        double arcsin = Math.asin(num1);
        double arccos = Math.acos(num1);
        double arctan = Math.atan(num1);

        //calculates square root
        
        double sqrt = Math.sqrt(num1);
        
        //calculates natural log and log base 10
        
        double ln = Math.log(num1);
        double log = Math.log10(num1);
        
        //prints results
        
        switch (operation) {
            case "sin":
                System.out.println("sin(" + num1 + ") = " + sin);
                break;
            case "cos":
                System.out.println("cos(" + num1 + ") = " + cos);    
                break;
            case "tan":
                System.out.println("tan(" + num1 + ") = " + tan);
                break;
            case "arcsin":
                System.out.println("arcsin(" + num1 + ") = " + arcsin);
                break;
            case "arccos":
                System.out.println("arccos(" + num1 + ") = " + arccos);
                break;
            case "arctan":
                System.out.println("arctan(" + num1 + ") = " + arctan);
                break;
            case "sqrt":
                System.out.println("sqrt(" + num1 + ") = " + sqrt);
                break;
            case "ln":
                System.out.println("ln(" + num1 + ") = " + ln);
                break;
            case "log":
                System.out.println("log(" + num1 + ") = " + log);
                break;
        }
        
        //prompts user to enter second number
        
        switch (operation) {
            case "+":
                System.out.println("enter second number");
                break;
            case "-":
                System.out.println("enter second number");
                break;
            case "*":
                System.out.println("enter second number");
                break;
            case "/":
                System.out.println("enter second number");
                break;
            case "^":
                System.out.println("enter second number");
        }
        
        double num2 = scanner.nextDouble();
        
        //calculates sum, difference, product, and quotient
        
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double power = Math.pow(num1, num2);

        //prints results
        
        switch (operation) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + sum);
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + difference); 
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + product);
                break;
            case "/":
                System.out.println(num1 + " / " + num2 + " = " + quotient);
                break;
            case "^":
                System.out.println(num1 + " ^ " + num2 + " = " + power);
                break;
            default:
                System.out.println("invalid operation");
                break;
        }
                
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

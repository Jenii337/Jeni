
package calculator;
import javax.swing.JFrame;



public class frame extends JFrame {
    
    public frame() {
        
        JavaApplication4 calculator = new JavaApplication4();
        setSize(500, 500);
        add(calculator);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

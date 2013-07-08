
package filecopy;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.JFrame;

public class JavaApplication5 {

    public static void main(String[] args) throws IOException {
       Path NewEmpty = Paths.get("/Users/Jeni/NetBeansProjects/JavaApplication5/src/filecopy/NewEmpty.java");
       Path NewEmpty1 = Paths.get("/Users/Jeni/NetBeansProjects/JavaApplication5/src/filecopy/NewEmpty1.java");
       CopyOption[] option = new CopyOption[] 
       {
           StandardCopyOption.REPLACE_EXISTING,
           StandardCopyOption.COPY_ATTRIBUTES 
       };
       Files.copy(NewEmpty, NewEmpty1, option);
       
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
           
}
    

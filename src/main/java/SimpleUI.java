import javax.swing.*;
import java.awt.*;

public class SimpleUI {

    static GraphicsConfiguration gc;

    public static void main(String[] args) {
        MainMenu mmenu = new MainMenu();
        JFrame frame= new JFrame(gc); // Create a new JFrame
        frame.setSize(500,300);
        frame.setJMenuBar(mmenu);
        frame.getContentPane().add(new ButtonPanel());
        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

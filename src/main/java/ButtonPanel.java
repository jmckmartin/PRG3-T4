import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    public JButton jbut;
    public void add_jbutton(String button_text, String button_output){
        jbut = new JButton(button_text);
        add(jbut);
        jbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(button_output);
            }
        });
    }

    public ButtonPanel(){

        // Create a grid and fill with objects with unique labels and
//      // Output messages once pressed

        setLayout(new GridLayout(3,1));
        add_jbutton("Press 0", "0 Pressed");
        add_jbutton("Press 1", "1 Pressed");
        add_jbutton("Press 2", "2 Pressed");
    }
}

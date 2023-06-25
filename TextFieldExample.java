import javax.swing.*;
import java.awt.*;

public class TextFieldExample extends JFrame
 {
    public TextFieldExample() 
    {
        super("Text Fields, Password Fields, Text Areas, Scroll Pane Example");

        // Create the text field and password field
        JTextField textField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);

        // Create the text area
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // Create the scroll pane and add the text area to it
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Create the panel and add the components to it
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.add(textField);
        panel.add(passwordField);
        panel.add(scrollPane);

        
        getContentPane().add(panel);

        
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextFieldExample();
    }
}

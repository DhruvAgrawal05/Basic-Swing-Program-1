import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo extends JFrame 
{
    public GridBagLayoutDemo() 
    {
    
        // Create a new JFrame
        super("GridBagLayout Demo");

        // Create a new GridBagLayout
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        // Create a new GridBagConstraints object
        GridBagConstraints gbc = new GridBagConstraints();

        // Create the label
        JLabel label = new JLabel("Enter your name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 0, 10);
        add(label, gbc);

        // Create the text field
        JTextField textField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 0, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField, gbc);

        // Create the first button
        JButton button1 = new JButton("Button 1");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 10, 10, 0);
        add(button1, gbc);

        // Create the second button
        JButton button2 = new JButton("Button 2");
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 0, 10, 10);
        add(button2, gbc);

        // Set the size and make the JFrame visible
        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridBagLayoutDemo();
    }
}

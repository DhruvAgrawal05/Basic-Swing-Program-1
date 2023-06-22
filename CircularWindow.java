import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class CircularWindow extends JFrame {
    
    public CircularWindow() {
        super("Circular Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add your UI components here
        // ...
        
        setSize(500, 500); // set the size of the JFrame
        setLocationRelativeTo(null); // center the JFrame on the screen
        setVisible(true); // show the JFrame
        
        setShape(createCircularShape()); // set the shape of the window
        //AWTUtilities.setWindowOpaque(this, false); // make the window transparent
    }
    
    private Shape createCircularShape() {
        int width = getWidth();
        int height = getHeight();
        return new Ellipse2D.Double(0, 0, width, height);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CircularWindow();
        });
    }
}

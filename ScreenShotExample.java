import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenShotExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Create a Robot object
            Robot robot = new Robot();

            // Get the default screen device
            GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

            // Get the dimensions of the screen
            Rectangle screenRect = device.getDefaultConfiguration().getBounds();

            // Capture the screenshot
            BufferedImage image = robot.createScreenCapture(screenRect);

            // Create a JLabel to display the screenshot image
            JLabel label = new JLabel(new ImageIcon(image));

            // Create a JFrame to display the JLabel
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(label);
            frame.setUndecorated(true); // Remove title bar and borders
            device.setFullScreenWindow(frame); // Set the JFrame to full screen mode
        } 
        catch (AWTException ex) 
        {
            System.err.println(ex);
        }
    }
}

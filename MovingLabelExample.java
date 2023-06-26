import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MovingLabelExample extends JFrame {

    private static final long serialVersionUID = 1L;
    //private JLabel label;
    private JButton label;
    private Random random;

    public MovingLabelExample() 
    {
        setTitle("click me if you can ");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        label = new JButton("click me ");
        label.setBounds(50, 50, 100, 30);

        random = new Random();

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                int x = random.nextInt(panel.getWidth() - label.getWidth());
                int y = random.nextInt(panel.getHeight() - label.getHeight());
                label.setLocation(x, y);
            }
        });

        panel.add(label);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MovingLabelExample();
    }
}

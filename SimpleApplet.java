import javax.swing.*;
import java.awt.*;

public class SimpleApplet {
    public static void main(String args[]) {

        JFrame frame = new JFrame("Simple Message");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(Color.RED);
                g.setFont(new Font("Serif", Font.BOLD, 20));
                g.drawString("Hello, Java!", 50, 50);

                g.setColor(Color.BLUE);
                g.setFont(new Font("SansSerif", Font.ITALIC, 25));
                g.drawString("Welcome!", 50, 100);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}

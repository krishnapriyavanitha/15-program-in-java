import java.awt.*;
import javax.swing.*;

class Clock extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(50, 50, 100, 100);
        g.drawLine(100, 100, 120, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new Clock());
        f.setSize(200, 200);
        f.setVisible(true);
    }
}

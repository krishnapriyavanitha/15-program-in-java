import javax.swing.*;
import java.awt.*;

public class ShapeDrawer extends JFrame {

    public ShapeDrawer() {
        setTitle("Shapes Drawing");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(50, 50, 100, 50);
        g.drawOval(200, 50, 100, 50);
        g.drawLine(50, 250, 250, 250);
        g.fillRect(200, 150, 80, 40);
    }

    public static void main(String[] args) {
        new ShapeDrawer();
    }
}

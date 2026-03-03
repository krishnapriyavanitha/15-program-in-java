import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandlingSwing extends JFrame implements ActionListener {

    JButton btn;
    JLabel label;

    public EventHandlingSwing() {
        setTitle("Event Handling Example");
        setSize(300, 200);
        setLayout(new FlowLayout());

        btn = new JButton("Click Me");
        label = new JLabel("");

        btn.addActionListener(this);

        add(btn);
        add(label);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new EventHandlingSwing();
    }
}

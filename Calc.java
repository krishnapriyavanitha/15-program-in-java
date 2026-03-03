import java.awt.*;

class Calc extends Frame {

    Calc() {
        setLayout(new FlowLayout());

        add(new TextField(10));

        for (int i = 0; i < 10; i++)
            add(new Button("" + i));

        add(new Button("+"));
        add(new Button("="));

        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calc();
    }
}

import java.awt.*;

public class LabelDemo extends Frame
{
    LabelDemo()
    {
        FlowLayout f1 = new FlowLayout();
        setLayout(f1);

        Label l2 = new Label("Welcome to Java");
        add(l2);
    }

    public static void main(String args[])
    {
        LabelDemo L1 = new LabelDemo();

        L1.setTitle("Label Demo Welcome to Java");
        L1.setSize(500, 500);
        L1.setVisible(true);
    }
}
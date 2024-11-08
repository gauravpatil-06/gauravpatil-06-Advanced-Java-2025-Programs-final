import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame
{
    ButtonDemo()
    {
        // Set layout
        setLayout(new FlowLayout());

        // Create buttons
        Button b1 = new Button("OK");
        Button b2 = new Button("RESET");
        Button b3 = new Button("CANCEL");

        // Add buttons to frame
        add(b1);
        add(b2);
        add(b3);
    }

    public static void main(String args[])
    {
        ButtonDemo bd1 = new ButtonDemo();

        bd1.setTitle("Button with Caption OK, RESET, CANCEL");
        bd1.setSize(500, 500);
        bd1.setVisible(true);
    }
}

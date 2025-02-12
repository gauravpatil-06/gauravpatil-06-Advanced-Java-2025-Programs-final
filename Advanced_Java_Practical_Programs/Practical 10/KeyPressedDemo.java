import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyPressedDemo extends JFrame implements KeyListener
{
    JLabel l1;
    JTextField jtf;

    KeyPressedDemo()
    {
        Container c = getContentPane();
        c.setBackground(Color.red);
        setLayout(new FlowLayout());

        l1 = new JLabel();
        jtf = new JTextField(20);
        l1.setBackground(Color.GREEN);

        add(l1);
        add(jtf);

        jtf.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        l1.setText("Key is Typed");
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        l1.setText("Key is Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        // l1.setText("Key is Released");
    }

    public static void main(String args[])
    {
        KeyPressedDemo kpd = new KeyPressedDemo();

        kpd.setTitle("Notepad");
        kpd.setVisible(true);
        kpd.setSize(1000, 800);
        kpd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class specialKeysdemo extends JFrame implements KeyListener
{
    Label l;
    TextArea area;

    specialKeysdemo()
    {
        setLayout(null);

        l = new Label();
        l.setBounds(20, 50, 100, 20);

        area = new TextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);

        add(l);
        add(area);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        l.setText("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        l.setText("Key Released");
    }

    public static void main(String args[])
    {
        specialKeysdemo skd = new specialKeysdemo();

        skd.setTitle("Special Keys Pressed demo");
        skd.setVisible(true);
        skd.setSize(400, 400);
        skd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

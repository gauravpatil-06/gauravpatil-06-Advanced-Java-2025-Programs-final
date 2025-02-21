import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NoOfClicks extends JFrame implements MouseListener
{
    JLabel L1;

    NoOfClicks()
    {
        Container c = getContentPane();
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        Font f1 = new Font("Arial Black", Font.BOLD, 20);

        c.setBackground(Color.cyan);

        L1 = new JLabel("Hello Mouse");
        L1.setFont(f1);
        c.add(L1);

        addMouseListener(this);
    }

    public void mousePressed(MouseEvent e)
    {
        L1.setText("Mouse Pressed No. of Clicks:" + e.getClickCount() + "at position " + e.getX() + "," + e.getY());
    }

    public void mouseReleased(MouseEvent e)
    {
    }

    public void mouseEntered(MouseEvent e)
    {
    }

    public void mouseExited(MouseEvent e)
    {
    }

    public void mouseClicked(MouseEvent e)
    {
    }

    public static void main(String args[])
    {
        NoOfClicks n1 = new NoOfClicks();

        n1.setTitle("NoOfClicks");
        n1.setVisible(true);
        n1.setSize(700, 700);
        n1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

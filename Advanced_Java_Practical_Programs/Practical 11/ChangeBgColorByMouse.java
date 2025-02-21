import java.awt.*;
import java.awt.event.*;

public class ChangeBgColorByMouse extends Frame implements MouseListener
{
    ChangeBgColorByMouse()
    {
        setLayout(new FlowLayout());

        addMouseListener(this);

        setBackground(Color.white);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void mouseClicked(MouseEvent e)
    {
        setBackground(Color.cyan);
    }

    public void mousePressed(MouseEvent e)
    {
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

    public static void main(String args[])
    {
        ChangeBgColorByMouse c1 = new ChangeBgColorByMouse();

        c1.setVisible(true);
        c1.setSize(550, 550);
        c1.setTitle("Change Background Color by Mouse");
    }
}

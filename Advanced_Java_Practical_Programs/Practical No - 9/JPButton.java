import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JPButton extends JFrame implements ActionListener
{
    JProgressBar progressBar;
    JButton b1Button;
    int i, flag = 0;

    JPButton()
    {
        b1Button = new JButton("Click To Load");
        Container c = getContentPane();
        FlowLayout flowLayout = new FlowLayout();
        c.setLayout(flowLayout);
        c.setBackground(Color.YELLOW);
        progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0000, 3000);
        progressBar.setStringPainted(true);
        progressBar.setToolTipText("This is Progress Bar");
        c.add(progressBar);
        add(b1Button);
        b1Button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        Barprogress();
        flag = 1;
    }

    void Barprogress()
    {
        if (flag == 1)
        {
            i = 0;
            while (i <= 3000)
            {
                i = i + 500;
                progressBar.setValue(i);
                try
                {
                    Thread.sleep(500);
                }
                catch (Exception e)
                {
                }
            }
        }
    }

    public static void main(String[] args)
    {
        JPButton jpb = new JPButton();

        jpb.setVisible(true);
        jpb.setTitle("Progress Bar");
        jpb.setSize(500, 500);
        jpb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jpb.Barprogress();
    }
}

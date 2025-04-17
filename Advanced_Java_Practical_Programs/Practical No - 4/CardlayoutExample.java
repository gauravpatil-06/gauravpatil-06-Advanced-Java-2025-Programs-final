import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CardlayoutExample extends JFrame implements ActionListener
{
    CardLayout card;
    JButton b1, b2, b3;
    Container c;

    CardlayoutExample()
    {
        c = getContentPane();
        card = new CardLayout(40, 30);
        c.setLayout(card);

        Font f = new Font("Arial Black", Font.BOLD, 40);

        try
        {
            b1 = new JButton("Apple");
            b1.setFont(f);
            b2 = new JButton("Boy");
            b2.setFont(f);
            b3 = new JButton("cat");
            b3.setFont(f);

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);

            c.add("a", b1);
            c.add("b", b2);
            c.add("c", b3);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void actionPerformed(ActionEvent ae)
    {
        card.next(c);
    }

    public static void main(String args[])
    {
        CardlayoutExample c1 = new CardlayoutExample();

        c1.setVisible(true);
        c1.setTitle("CardlayoutExample");
        c1.setSize(600, 600);
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
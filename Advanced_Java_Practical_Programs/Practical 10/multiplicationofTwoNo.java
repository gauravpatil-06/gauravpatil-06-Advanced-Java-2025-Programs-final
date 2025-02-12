import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class multiplicationofTwoNo extends JFrame implements ActionListener
{
    JTextField jTextField1, jTextField2, jTextField3;
    JLabel label1, label2, label3;
    JButton b1;

    multiplicationofTwoNo()
    {
        setLayout(null);
        Container c = getContentPane();
        c.setBackground(Color.ORANGE);

        jTextField1 = new JTextField(20);
        jTextField2 = new JTextField(20);
        jTextField3 = new JTextField(20);

        label1 = new JLabel(" Enter First Number", JLabel.RIGHT);
        label2 = new JLabel(" Enter Second Number", JLabel.RIGHT);
        label3 = new JLabel("Result ", JLabel.RIGHT);

        b1 = new JButton("MULTIPLY ");
        b1.setBackground(Color.LIGHT_GRAY);

        label1.setBounds(100, 100, 130, 30);
        label2.setBounds(100, 180, 130, 30);
        jTextField1.setBounds(250, 100, 150, 30);
        jTextField2.setBounds(250, 180, 150, 30);
        jTextField3.setBounds(250, 260, 150, 30);
        b1.setBounds(180, 300, 100, 30);
        label3.setBounds(100, 260, 130, 30);

        add(label1);
        add(label2);
        add(jTextField1);
        add(jTextField2);
        add(jTextField3);
        add(b1);
        add(label3);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        int n1 = Integer.parseInt(jTextField1.getText());
        int n2 = Integer.parseInt(jTextField2.getText());
        int result = (n1 * n2);
        jTextField3.setText("" + result);
    }

    public static void main(String args[])
    {
        multiplicationofTwoNo mtn = new multiplicationofTwoNo();

        mtn.setVisible(true);
        mtn.setTitle("Multiplication of two Number");
        mtn.setSize(600, 600);
        mtn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

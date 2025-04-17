import java.awt.*;
import javax.swing.*;

class Panel1 extends Panel
{
    Panel1()
    {
        Font f = new Font("Arial Black", Font.BOLD, 30);
        setLayout(null);

        setBackground(Color.cyan);
        setForeground(Color.black);

        JTextField tf = new JTextField();

        tf.setFont(f);
        tf.setHorizontalAlignment(SwingConstants.RIGHT);
        tf.setBounds(10, 40, 380, 100);
        add(tf);
    }
}

class Panel2 extends Panel
{
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;

    Panel2()
    {
        GridLayout gl = new GridLayout(6, 4, 5, 5);
        setLayout(gl);

        Font f = new Font("Arial Black", Font.BOLD, 30);
        setFont(f);

        setBackground(Color.cyan);
        setForeground(Color.black);

        try
        {
            b1 = new Button("%");
            b2 = new Button("CE");
            b3 = new Button("C");
            b4 = new Button("X");
            b5 = new Button("%");
            b6 = new Button("C");
            b7 = new Button("X");
            b8 = new Button("/");
            b9 = new Button("7");
            b10 = new Button("8");
            b11 = new Button("9");
            b12 = new Button("*");
            b13 = new Button("4");
            b14 = new Button("5");
            b15 = new Button("6");
            b16 = new Button("-");
            b17 = new Button("1");
            b18 = new Button("2");
            b19 = new Button("3");
            b20 = new Button("+");
            b21 = new Button("+/-");
            b22 = new Button("0");
            b23 = new Button(".");
            b24 = new Button("=");

            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(b10);
            add(b11);
            add(b12);
            add(b13);
            add(b14);
            add(b15);
            add(b16);
            add(b17);
            add(b18);
            add(b19);
            add(b20);
            add(b21);
            add(b22);
            add(b23);
            add(b24);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

class Calculator extends Frame
{
    Calculator()
    {
        Panel1 p1 = new Panel1();
        Panel2 p2 = new Panel2();

        p1.setSize(400, 120);
        p2.setSize(400, 580);
        add(p1);
        add(p2);
    }

    public static void main(String args[])
    {
        Calculator c1 = new Calculator();

        c1.setVisible(true);
        c1.setTitle("Calculator");
        c1.setSize(400, 600);
    }
}
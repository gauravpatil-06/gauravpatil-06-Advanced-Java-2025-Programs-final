import java.awt.*;

class GridLayout2Demo extends Frame
{
    GridLayout2Demo()
    {
        GridLayout gl = new GridLayout(3, 3, 20, 20);
        setLayout(gl);

        Font f = new Font("Arial Black", Font.BOLD, 40);
        setFont(f);

        setBackground(Color.cyan);
        setForeground(Color.black);

        Button b[] = new Button[6];

        for (int i = 1; i <= 5; i++)
        {
            b[i] = new Button("    Button " + i + "    ");
            b[i].setBackground(Color.pink);
            add(b[i]);
        }
    }

    public static void main(String args[])
    {
        GridLayout2Demo g1 = new GridLayout2Demo();

        g1.setVisible(true);
        g1.setTitle("GridLayout Manager");
        g1.setSize(600, 300);
    }
}
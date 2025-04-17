import java.awt.*;

class GridLayout1Demo extends Frame
{
    GridLayout1Demo()
    {
        GridLayout gl = new GridLayout(3, 3, 20, 20);
        setLayout(gl);

        Font f = new Font("Arial Black", Font.BOLD, 40);
        setFont(f);

        setBackground(Color.cyan);
        setForeground(Color.black);

        Button b[] = new Button[10];

        for (int i = 0; i <= 9; i++)
        {
            b[i] = new Button("" + i);
            b[i].setBackground(Color.pink);
            add(b[i]);
        }
    }

    public static void main(String args[])
    {
        GridLayout1Demo g1 = new GridLayout1Demo();

        g1.setVisible(true);
        g1.setTitle("GridLayout Manager");
        g1.setSize(400, 400);
    }
}
import java.awt.*;

class FlowLayoutDemo extends Frame
{
    FlowLayoutDemo()
    {
        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 20, 20);
        setLayout(fl);

        Font f = new Font("Arial Black", Font.BOLD, 50);
        setFont(f);

        setBackground(Color.cyan);
        setForeground(Color.black);

        Button b[] = new Button[10];

        for (int i = 0; i <= 9; i++)
        {
            b[i] = new Button("    " + i + "    ");
            b[i].setBackground(Color.pink);
            add(b[i]);
        }
    }

    public static void main(String args[])
    {
        FlowLayoutDemo g1 = new FlowLayoutDemo();

        g1.setVisible(true);
        g1.setTitle("FlowLayout Manager");
        g1.setSize(600, 600);
    }
}
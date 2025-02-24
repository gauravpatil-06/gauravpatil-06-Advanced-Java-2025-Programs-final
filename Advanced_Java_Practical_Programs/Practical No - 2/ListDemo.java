import java.awt.*;

class ListDemo extends Frame
{
    ListDemo()
    {
        Font fn = new Font("Arial Black", Font.BOLD, 30);
        setFont(fn);
        setBackground(Color.cyan);
        setForeground(Color.red);

        FlowLayout f = new FlowLayout(FlowLayout.CENTER, 40, 40);
        setLayout(f);

        List L1 = new List(3);

        L1.add("Pune");
        L1.add("Mumbai");
        L1.add("Nashik");
        L1.add("Sambhaji Nagar");
        L1.add("Jalgaon");
        L1.add("Muktainagar");
        L1.add("Goa");
        L1.add("Agra");
        L1.add("Delhi");
        L1.add("Amravti");
        L1.setBackground(Color.yellow);

        add(L1);
    }

    public static void main(String args[])
    {
        ListDemo f1 = new ListDemo();

        f1.setVisible(true);
        f1.setSize(400, 400);
        f1.setTitle("List Demo");
    }
}
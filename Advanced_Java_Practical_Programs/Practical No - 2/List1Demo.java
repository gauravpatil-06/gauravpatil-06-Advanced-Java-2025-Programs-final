import java.awt.*;

class List1Demo extends Frame
{
    List1Demo()
    {
        Font fn = new Font("Arial Black", Font.BOLD, 30);
        setFont(fn);
        setBackground(Color.cyan);
        setForeground(Color.red);

        FlowLayout f = new FlowLayout(FlowLayout.CENTER, 40, 40);
        setLayout(f);

        List L1 = new List(3, true);

        L1.add("Lokmat");
        L1.add("Shivshai");
        L1.add("Diwya Marathi");
        L1.add("Sakal");
        L1.add("Pudhari");
        L1.add("Puny Nagari");
        L1.add("Ram Rajya");
        L1.add("Keshari");
        L1.add("Jay Kishan");
        L1.add("Desh Dhut");
        L1.setBackground(Color.yellow);

        add(L1);
    }

    public static void main(String args[])
    {
        List1Demo f1 = new List1Demo();

        f1.setVisible(true);
        f1.setSize(400, 400);
        f1.setTitle("List Demo");
    }
}
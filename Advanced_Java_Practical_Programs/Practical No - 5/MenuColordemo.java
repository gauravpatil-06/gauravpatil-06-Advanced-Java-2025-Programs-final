import java.awt.*;

class MenuColordemo extends Frame
{
    MenuColordemo()
    {
        setBackground(Color.cyan);

        Font f1 = new Font("Arial Black", Font.BOLD, 20);
        setFont(f1);

        MenuBar mbr = new MenuBar();

        Menu m1 = new Menu("Color");
        MenuItem m11 = new MenuItem("Red");
        MenuItem m12 = new MenuItem("Black");
        MenuItem m13 = new MenuItem("Blue");
        MenuItem m14 = new MenuItem("Green");
        MenuItem m15 = new MenuItem("Orange");
        MenuItem m16 = new MenuItem("Purple");
        MenuItem m17 = new MenuItem("Yellow");
        MenuItem m18 = new MenuItem("White");
        MenuItem m19 = new MenuItem("Cyan");
        MenuItem m10 = new MenuItem("Gray");

        m13.setEnabled(false);

        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m15);
        m1.add(m16);
        m1.add(m17);
        m1.add(m18);
        m1.add(m19);
        m1.add(m10);

        mbr.add(m1);
        setMenuBar(mbr);
    }

    public static void main(String args[])
    {
        MenuColordemo n1 = new MenuColordemo();

        n1.setVisible(true);
        n1.setTitle("Menu Color Demo");
        n1.setSize(600, 600);
    }
}
import java.awt.*;
import javax.swing.*;

class JScrollPaneDemo extends JFrame
{
    JScrollPaneDemo()
    {
        Container c = getContentPane();
        Font f1 = new Font("Cambria", Font.BOLD, 20);

        JTextArea ta1 = new JTextArea("Good Morning Friends Have A Nice Day...");
        ta1.setFont(f1);

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(ta1, v, h);

        c.add(jsp);
    }

    public static void main(String args[])
    {
        JScrollPaneDemo j1 = new JScrollPaneDemo();

        j1.setVisible(true);
        j1.setTitle("JScrollPane Demo");
        j1.setSize(600, 600);
        j1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
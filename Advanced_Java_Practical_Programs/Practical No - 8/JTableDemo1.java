import javax.swing.*;
import java.awt.*;

class JTableDemo1 extends JFrame
{
    JTableDemo1()
    {
        Container c = getContentPane();

        BorderLayout b1 = new BorderLayout();
        c.setLayout(b1);

        String colHeads[] = {"Name", "Percentage", "Grade"};
        String data[][] = {
            {"Gaurav", "99.90%", "A++"},
            {"Vinod", "98.00%", "A+"},
            {"Yogita", "98.50%", "A+"},
            {"Akash", "97.70%", "A+"},
            {"Shivam", "96.75%", "A"},
            {"Vitthal", "95.67%", "A"},
            {"Srushti", "86.03%", "A"},
            {"Om", "89.93%", "C"},
            {"Rohan", "92.75%", "B"}
        };

        JTable jt = new JTable(data, colHeads);

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(jt, v, h);
        c.add(jsp, BorderLayout.CENTER);
    }

    public static void main(String args[])
    {
        JTableDemo1 j1 = new JTableDemo1();

        j1.setVisible(true);
        j1.setTitle("JTable Demo");
        j1.setSize(600, 600);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

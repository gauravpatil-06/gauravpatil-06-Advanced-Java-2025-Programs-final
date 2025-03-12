import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

class JTreeNodeDemo extends JFrame
{
    JTreeNodeDemo()
    {
        Container c = getContentPane();
        BorderLayout b1 = new BorderLayout();
        c.setLayout(b1);

        c.setBackground(Color.cyan);
        c.setForeground(Color.black);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("India");
        DefaultMutableTreeNode r1 = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode r2 = new DefaultMutableTreeNode("Gujarat");
        root.add(r1);
        root.add(r2);

        DefaultMutableTreeNode r11 = new DefaultMutableTreeNode("Mumbai");
        DefaultMutableTreeNode r12 = new DefaultMutableTreeNode("Pune");
        DefaultMutableTreeNode r13 = new DefaultMutableTreeNode("Nashik");
        DefaultMutableTreeNode r14 = new DefaultMutableTreeNode("Nagpur");

        r1.add(r11);
        r1.add(r12);
        r1.add(r13);
        r1.add(r14);

        JTree jt = new JTree(root);

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(jt, v, h);
        c.add(jsp, BorderLayout.WEST);
    }

    public static void main(String args[])
    {
        JTreeNodeDemo j1 = new JTreeNodeDemo();

        j1.setVisible(true);
        j1.setTitle("JTree Demo");
        j1.setSize(600, 600);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
import java.awt.*;

class GridBagLayoutExample extends JFrame
{
    GridBagLayoutExample()
    {
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(grid);

        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(new Button("Button One"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(new Button("Button two"), gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(new Button("Button Three"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(new Button("Button Four"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 3;
        this.add(new Button("Button Five"), gbc);
    }

    public static void main(String[] args)
    {
        GridBagLayoutExample g1 = new GridBagLayoutExample();

        g1.setSize(400, 400);
        g1.setVisible(true);
        g1.setTitle("GridBag Layout Example");
        g1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
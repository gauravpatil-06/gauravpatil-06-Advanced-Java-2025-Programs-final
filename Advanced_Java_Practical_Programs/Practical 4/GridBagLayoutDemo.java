import java.awt.*;
import javax.swing.*;

class GridBagLayoutDemo extends JFrame
{  
    GridBagLayoutDemo() 
    {  
		GridBagLayout grid =new GridBagLayout();
		setLayout(grid);
		GridBagConstraints gbc = new GridBagConstraints();
		
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;
        add(new JTextField(20), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(new JLabel("Comments:"), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        add(new TextArea(15,15), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0.0;
        gbc.weighty = 0.0;
        add(new JButton(" Submit "), gbc);
    }  
    public static void main(String[] args) 
    {   
		 GridBagLayoutDemo g1 = new GridBagLayoutDemo(); 
		 g1.setVisible(true);  
		 g1.setTitle("GridBag Layout Demo");
		 g1.pack();
         g1.setSize(600, 500);
         g1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }  
}
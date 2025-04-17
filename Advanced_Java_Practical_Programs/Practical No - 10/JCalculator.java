import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JCalculator extends JFrame implements ActionListener
{
	JLabel L1,L2,L3,L4;
	JTextField tf1,tf2,tf3;
	JButton b1,b2,b3,b4;
	JCalculator()
	{
		Container c = getContentPane();
        c.setLayout(null);;
		
		Font f1 = new Font("Arial Black",Font.BOLD,40);
		Font f2 = new Font("Arial Black",Font.BOLD,20);
		setFont(f2);
		
		c.setBackground(Color.cyan);
		
		L1 = new JLabel("Calculator",JLabel.CENTER);
		L1.setFont(f1);
		L1.setForeground(Color.red);
		
		L2 = new JLabel("Enter 1st Number:",JLabel.RIGHT);
		L2.setFont(f2);
		L2.setForeground(Color.black);
		
		L3 = new JLabel("Enter 2nd Number:",JLabel.RIGHT);
		L3.setFont(f2);
		L3.setForeground(Color.black);
		
		L4 = new JLabel("Result:",JLabel.RIGHT);
		L4.setFont(f2);
		L4.setForeground(Color.black);
		
		tf1 = new JTextField(30);
		tf1.setFont(f2);
		tf2 = new JTextField(30);
		tf2.setFont(f2);
		tf3 = new JTextField(30);
		tf3.setFont(f2);
		
		b1 = new JButton("Multiply");
		b1.setFont(f2);
		b1.setForeground(Color.blue);
		b1.setBackground(Color.pink);
	
		L1.setBounds(70,70,400,50);
		L2.setBounds(30,170,250,30);
		tf1.setBounds(300,170,150,30);
		L3.setBounds(30,240,250,30);
		tf2.setBounds(300,240,150,30);
		L4.setBounds(30,310,250,30);
		tf3.setBounds(300,310,150,30);
		b1.setBounds(200,390,150,40);
	
		c.add(L1);
		c.add(L2);c.add(tf1);
		c.add(L3);c.add(tf2);
		c.add(L4);c.add(tf3);
		c.add(b1);
		b1.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		int c;
		
		if(b1 == ae.getSource())
		{
			c = a * b;
			tf3.setText(c +" ");
		}
	}
	public static void main(String args[])
	{
		JCalculator c1 = new JCalculator();
		c1.setVisible(true);
		c1.setTitle("Calculator");
		c1.setSize(550,550);
	}
}
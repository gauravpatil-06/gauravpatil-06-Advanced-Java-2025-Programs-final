import java.awt.*;
class BorderLayoutDemo extends Frame
{
	BorderLayoutDemo()
	{
		 BorderLayout bl = new BorderLayout();
		setLayout(bl);
		
		Font f = new Font("Arial Black",Font.BOLD,60);
		setFont(f);
		
		setBackground(Color.cyan);
		setForeground(Color.black);
		
		Button b1=new Button("East");
		b1.setBackground(Color.pink);
		Button b2=new Button("West");
		b2.setBackground(Color.pink);
		Button b3=new Button("South");
		b3.setBackground(Color.pink);
		Button b4=new Button("North");
		b4.setBackground(Color.pink);
		Button b5=new Button("Center");
		b5.setBackground(Color.pink);
		
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.NORTH);
		add(b5,BorderLayout.CENTER);
		
	}
	public static void main(String args[])
	{
		BorderLayoutDemo b1 = new BorderLayoutDemo();
		b1.setVisible(true);
		b1.setTitle("BorderLayout Manager");
		b1.setSize(600,500);
	}
}
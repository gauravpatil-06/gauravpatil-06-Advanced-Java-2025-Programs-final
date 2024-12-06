import java.awt.*;
class FlowLayout1Demo extends Frame
{
	FlowLayout1Demo()
	{
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT,20,20);
		setLayout(fl);
		
		Font f = new Font("Arial Black",Font.BOLD,40);
		setFont(f);
		
		setBackground(Color.cyan);
		setForeground(Color.black);
		
		Button b[] = new Button[6];
		for(int i=1;i<=5;i++)
		{
			// add(new Button("Button"+i));
			b[i] = new Button("    Button "+i+"    ");
			b[i].setBackground(Color.pink);
			add(b[i]);
		}
	}
	public static void main(String args[])
	{
		FlowLayout1Demo g1 = new FlowLayout1Demo();
		g1.setVisible(true);
		g1.setTitle("FlowLayout Manager");
		g1.setSize(600,300);
	}
}
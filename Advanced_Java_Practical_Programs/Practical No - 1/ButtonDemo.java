import java.awt.*;
class ButtonDemo extends Frame
{
	ButtonDemo()
	{
		Font fn = new Font("Arial Black",Font.BOLD,30);
		setFont(fn);
		setBackground(Color.cyan);
		setForeground(Color.red);
		FlowLayout f = new FlowLayout(FlowLayout.CENTER,10,10);
		setLayout(f);
		
		Button b1 = new Button("OK");	
		Button b2 = new Button("RETRY");	
		Button b3 = new Button("CANCEl");
		add(b1);
		add(b2);
		add(b3);
	}
	public static void main(String args[])
	{
		ButtonDemo f1 = new ButtonDemo ();
		f1.setVisible(true);
		f1.setSize(400,400);
		f1.setTitle("Button Demo");
	}
}
import java.awt.*;
class WelcomemessageDemo extends Frame
{
	WelcomemessageDemo()
	{
		Font fn = new Font("Arial Black",Font.BOLD,30);
		setFont(fn);
		setBackground(Color.cyan);
		setForeground(Color.red);
		FlowLayout f = new FlowLayout();
		setLayout(f);
		Label L1 = new Label("Welcome to java");
		add(L1);
	}
	public static void main(String args[])
	{
		WelcomemessageDemo f1 = new WelcomemessageDemo ();
		f1.setVisible(true);
		f1.setSize(400,400);
		f1.setTitle("RadioButton Demo");
	}
}
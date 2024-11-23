import java.awt.*;
class CheckboxDemo extends Frame
{
	CheckboxDemo()
	{
		Font fn = new Font("Arial Black",Font.BOLD,30);
		setFont(fn);
		setBackground(Color.cyan);
		setForeground(Color.red);
		FlowLayout f = new FlowLayout(FlowLayout.CENTER,10,10);
		setLayout(f);
		
		Checkbox c1 = new Checkbox("Marathi");
		Checkbox c2 = new Checkbox("Hindi");
		Checkbox c3 = new Checkbox("English");
		Checkbox c4 = new Checkbox("Sanskrit");
		add(c1);
		add(c2);
		add(c3);
		add(c4);
	}
	public static void main(String args[])
	{
		CheckboxDemo f1 = new CheckboxDemo ();
		f1.setVisible(true);
		f1.setSize(600,500);
		f1.setTitle("Checkbox Demo");
	}
}
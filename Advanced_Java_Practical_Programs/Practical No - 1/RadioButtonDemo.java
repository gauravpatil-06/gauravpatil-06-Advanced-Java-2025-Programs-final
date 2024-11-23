// RadioButton Class
import java.awt.*;
class RadioButtonDemo extends Frame
{
	RadioButtonDemo()
	{
		Font fn = new Font("Arial Black",Font.BOLD,30);
		setFont(fn);
		setBackground(Color.cyan);
		setForeground(Color.red);
		FlowLayout f = new FlowLayout(FlowLayout.CENTER,10,10);
		setLayout(f);
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox c1 = new Checkbox("Male",true,cbg);
		Checkbox c2 = new Checkbox("Female",false,cbg);
		Checkbox c3 = new Checkbox("Other",false,cbg);
		add(c1);
		add(c2);
		add(c3);
	}
	public static void main(String args[])
	{
		RadioButtonDemo f1 = new RadioButtonDemo();
		f1.setVisible(true);
		f1.setSize(400,400);
		f1.setTitle("RadioButton Demo");
	}
}
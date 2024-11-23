// RadioButton Class
import java.awt.*;
class RegistrationDemo extends Frame
{
	Label L1,L2,L3,L4,L5,L6;
	Button b1;
	TextField tf1,tf2,tf3,tf4,tf5;
	RegistrationDemo()
	{
		Font f1 = new Font("Arial Black",Font.BOLD,50);
		Font f2 = new Font("Arial Black",Font.BOLD,25);
		Font f3 = new Font("Arial Black",Font.BOLD,30);
		setFont(f2);
		setBackground(Color.cyan);
		setForeground(Color.black);
		setLayout(null);
		
		L1 = new Label("Register Here");
		L1.setFont(f1);
		L1.setForeground(Color.red);
		L2 = new Label("Enter Your Name:",Label.RIGHT);
		L3 = new Label("Enter Your Email:",Label.RIGHT);
		L4 = new Label("Enter Your Mobile No:",Label.RIGHT);
		L5 = new Label("Enter Your Username:",Label.RIGHT);
		L6 = new Label("Enter Your Password:",Label.RIGHT);

		tf1 = new TextField(30);
		tf2 = new TextField(30);
		tf3 = new TextField(30);
		tf4 = new TextField(30);
		tf5 = new TextField(30);

		b1 = new Button("Submit");
		b1.setFont(f3);
		b1.setBackground(Color.pink);
		b1.setForeground(Color.blue);	

		TextArea ta = new TextArea("Welcome to World of java Programming....");
		ta.setBackground(Color.yellow);
		ta.setForeground(Color.black);

		L1.setBounds(280,70,400,60);
		L2.setBounds(140,200,290,25);
		tf1.setBounds(450,200,290,30);
		L3.setBounds(140,250,290,25);
		tf2.setBounds(450,250,290,30);
		L4.setBounds(140,300,290,25);
		tf3.setBounds(450,300,290,30);
		L5.setBounds(140,350,290,25);
		tf4.setBounds(450,350,290,30);
		L6.setBounds(140,400,290,25);
		tf5.setBounds(450,400,290,30);
		b1.setBounds(350,500,200,50);
		ta.setBounds(150,600,600,100);

		add(L1);
		add(L2);add(tf1);
		add(L3);add(tf2);
		add(L4);add(tf3);
		add(L5);add(tf4);
		add(L6);add(tf5);
		add(b1);
		add(ta);
	}
	public static void main(String args[])
	{
		RegistrationDemo f = new RegistrationDemo();
		f.setVisible(true);
		f.setSize(900,800);
		f.setTitle("Registration Form");
	}
}
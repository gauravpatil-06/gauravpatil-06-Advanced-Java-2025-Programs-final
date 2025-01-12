import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ComboBoxDemo extends JFrame implements ItemListener
{
    JComboBox cb;
    Label L1;
    ComboBoxDemo()
    {
        Font f1 = new Font("Arial Black",Font.BOLD,20);
		Font f2 = new Font("Arial Black",Font.BOLD,16);
			
		FlowLayout f =new FlowLayout(FlowLayout.CENTER,20,20);
        setLayout(f);
		
        cb=new JComboBox();
		cb.setFont(f1);
        cb.addItem("Solapur");
        cb.addItem("Pune");
        cb.addItem("Banglore");
        cb.addItem("Mumbai");
		
        L1=new Label("Select city                 ");
		L1.setFont(f2);
        add(cb);
        add(L1);
		cb.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ae)
    {
        if(ae.getStateChange()==ItemEvent.SELECTED)
		{
            String city=(String)ae.getItem();
            L1.setText("You are in "+city);
        }
    }
    public static void main(String args[]) 
	{ 
		ComboBoxDemo j1=new ComboBoxDemo(); 
		j1.setVisible(true); 
		j1.setTitle("ComboBox Demo"); 
		j1.setSize(600,600);     
		j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	} 
}

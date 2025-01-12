import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JComboBoxStates extends JFrame implements ItemListener
{
    JComboBox cb;
    Label L1;
    JComboBoxStates()
    {
        Container c=getContentPane();
        Font f1 = new Font("Cambria",Font.BOLD,20);
		Font f2 = new Font("Cambria",Font.BOLD,16);
		
		FlowLayout f =new FlowLayout(FlowLayout.CENTER,20,20);
        setLayout(f);
		
		c.setBackground(Color.cyan);
		c.setForeground(Color.black);
		
        cb=new JComboBox ();
		cb.setFont(f1);
        cb.addItem("Maharashtra");
        cb.addItem("Goa");
        cb.addItem("Karnataka");
        cb.addItem("Telangana");
        cb.addItem("Andhra Pradesh");
        cb.addItem("Uttar Pradesh");
        cb.addItem("Chhattisgarh");
        cb.addItem("Punjab");
        
        L1=new Label("Select State                  ");
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
		JComboBoxStates j1=new JComboBoxStates(); 
		j1.setVisible(true); 
		j1.setTitle("JComboBoxStates"); 
		j1.setSize(600,600);     
		j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	} 
}

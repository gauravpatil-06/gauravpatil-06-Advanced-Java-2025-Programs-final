import java.awt.*;
import java.awt.event.*;
class MouseEventDemo extends Frame implements MouseMotionListener
{
	MouseEventDemo()
	{
		setBackground(Color.cyan);
        
        Font f1 = new Font("Arial Black", Font.BOLD, 16);
        setFont(f1);
        
        FlowLayout f = new FlowLayout();
        setLayout(f);
        
        Label L1 = new Label("Enter Text:");
        
        TextField tf1 = new TextField(30);
        add(L1);
        add(tf1);
		tf1.addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent me)
	{
		System.out.println("Mouse Dragged Event Occured...!!!");
	}
	public void mouseMoved(MouseEvent me)
	{
		System.out.println("Mouse Moved Event Occured...!!!");
	}
	public static void main(String args[])
	{
		MouseEventDemo f1 = new MouseEventDemo();
		f1.setVisible(true);
		f1.setSize(600,600);
		f1.setTitle("MouseEvent Frame");
	}
}
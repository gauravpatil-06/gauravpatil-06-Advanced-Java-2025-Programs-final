import java.awt.*;
import java.awt.event.*;
class KeyEventFunctionKeys extends Frame implements KeyListener 
{
    KeyEventFunctionKeys() 
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
        tf1.addKeyListener(this);
     
        addWindowListener(new WindowAdapter() 
		{
            public void windowClosing(WindowEvent we) 
			{
                System.exit(0);
            }
        });
    }
    public void keyPressed(KeyEvent ke) 
	{
        int keyCode = ke.getKeyCode();

        if (keyCode >= KeyEvent.VK_F1 && keyCode <= KeyEvent.VK_F12) 
		{
            System.out.println("Function Key " + (keyCode - KeyEvent.VK_F1 + 1) + " Pressed");
        } 
        else if (keyCode == KeyEvent.VK_UP) 
		{
            System.out.println("Up Arrow Key Pressed");
        } 
        else if (keyCode == KeyEvent.VK_DOWN) 
		{
            System.out.println("Down Arrow Key Pressed");
        } 
        else if (keyCode == KeyEvent.VK_LEFT) 
		{
            System.out.println("Left Arrow Key Pressed");
        } 
        else if (keyCode == KeyEvent.VK_RIGHT)
		{
            System.out.println("Right Arrow Key Pressed");
        } 
        else 
		{
            System.out.println("Key Pressed: " + KeyEvent.getKeyText(keyCode));
        }
    }
    public void keyTyped(KeyEvent ke) 
	{
        System.out.println("Key Typed...!!!");
    }
    public void keyReleased(KeyEvent ke)
	{
        System.out.println("Key Released...!!!");
    }
    public static void main(String args[])
	{
       KeyEventFunctionKeys f1 = new KeyEventFunctionKeys();
	   f1.setSize(600, 600);
       f1.setTitle("KeyEvent Frame");
       f1.setVisible(true);
       f1.setResizable(false);
    }
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JProgressBarButton extends JFrame implements ActionListener 
{
    JProgressBar jpb;
    JButton b1;
    int flag = 0;
    JProgressBarButton() 
	{
        Font f1 = new Font("Cambria", Font.BOLD, 16);
        Container c = getContentPane();

        setLayout(null);
        c.setBackground(Color.cyan);

        jpb = new JProgressBar(0, 3000);
        jpb.setValue(0);
        jpb.setBounds(60, 200, 200, 30);
        jpb.setStringPainted(true);

        b1 = new JButton("Click To Load");
        b1.setBounds(280, 200, 150, 30);
        b1.setFont(f1);
		b1.setBackground(Color.pink);

        c.add(jpb);
        c.add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) 
	{
        if (flag == 0) 
		{
            flag = 1;
            new Thread(() -> 
			{
                try 
				{
                    changeProgressBarValue();
                } catch (Exception e) 
				{
                    System.out.println(e);
                }
                flag = 0; // Reset flag when done
            }).start();
        }
    }
    public void changeProgressBarValue() throws Exception 
	{
        for (int i = 0; i <= 3000; i += 50) 
		{
            jpb.setValue(i);
            Thread.sleep(500); // Simulate loading time
        }
    }
    public static void main(String args[]) {
        JProgressBarButton jf = new JProgressBarButton();
        jf.setVisible(true);
        jf.setTitle("JProgressBar Demo");
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

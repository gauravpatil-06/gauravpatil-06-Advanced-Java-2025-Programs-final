import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class userLoginIdPass extends JFrame implements ActionListener 
{
    JPasswordField jPasswordField;
    JTextField jTextField;
    JLabel label1,label2,label3;
    JButton b1;
    userLoginIdPass()
    {
        setLayout(null);
        Container c=getContentPane();
        c.setBackground(Color.yellow);
        jPasswordField =new JPasswordField(20);
        jTextField=new JTextField(20);
        label1 =new JLabel(" Enter Username");
        label2 =new JLabel(" Enter Password");
        label3=new JLabel("                      ");
        b1=new JButton("Login ");
        b1.setBackground(Color.PINK);

        label1.setBounds(100,100,100,30);
        label2.setBounds(100,180,100,30);
        jTextField.setBounds(250,100,150,30);
        jPasswordField.setBounds(250,180,150,30);
        jPasswordField.setEchoChar('#');
        b1.setBounds(180,250,100,30);
        label3.setBounds(180,330,300,30);
        add(label1);
        add(label2);
        add(jPasswordField);
        add(jTextField);
        add(b1);
        add(label3);
        b1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            int length=jPasswordField.getText().length();
         
            if (length<6)
            {
                label3.setText("Password length must be >6 characters ");   
            }
            else 
            {
                label3.setText("Login Successfull ");   
            }
        }
    }
    public static void main(String args[]) 
  { 
    userLoginIdPass ulid1=new userLoginIdPass(); 
    ulid1.setVisible(true); 
    ulid1.setTitle("User Login Authentication"); 
    ulid1.setSize(600,600);     
    ulid1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  } 
}

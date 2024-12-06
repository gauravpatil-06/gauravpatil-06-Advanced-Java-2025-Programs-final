import java.awt.*;
public class BorderLaoutDemo extends Frame 
{
    BorderLaoutDemo()
    {
        BorderLayout b1 =new BorderLayout();
        setLayout(b1);

        Button B2=new Button("North");
        Button B3=new Button("West");
        Button B4=new Button("East");
        Button B5=new Button("South");
        Button B6=new Button("Center");

        add(B2,BorderLayout.NORTH);
        add(B3,BorderLayout.WEST);
        add(B4,BorderLayout.EAST);
        add(B5,BorderLayout.SOUTH);
        add(B6,BorderLayout.CENTER);



    }
    public static void main(String[] args)
    {
        BorderLaoutDemo bl1=new BorderLaoutDemo();
        bl1.setTitle("Border Layout Demo");
        bl1.setSize(500,500);
        bl1.setVisible(true);
    }   
}

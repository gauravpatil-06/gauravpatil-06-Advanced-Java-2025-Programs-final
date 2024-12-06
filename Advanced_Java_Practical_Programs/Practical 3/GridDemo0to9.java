import java.awt.*;

public class GridDemo0to9 extends Frame
{
    GridDemo0to9()
    {
        GridLayout Gl=new GridLayout(5,5,10,10);
        setLayout(Gl);
        Button b[]=new Button[10];
        for(int i=0;i<=9;i++)
        {
            b[i]=new Button(""+i); 
            add(b[i]); 
        }
    }
    public static void main(String[] args)
    {
        GridDemo0to9 gd1=new GridDemo0to9();
       gd1.setTitle("GridLayout for 0 to 9");
       gd1.setSize(500,500);
       gd1.setVisible(true);
    }     
}

import java.awt.*;

public class GridDemo55 extends Frame
{
    GridDemo55()
    {
        GridLayout Gl=new GridLayout(5,5,10,10);
        setLayout(Gl);
        Button b[]=new Button[26];
        for(int i=1;i<=25;i++)
        {
            b[i]=new Button(""+i); 
            add(b[i]); 
        }
        
       
    }
    public static void main(String[] args)
 {
    GridDemo55 gd1=new GridDemo55();
    gd1.setTitle("GridLayout for 5*5");
    gd1.setSize(500,500);
    gd1.setVisible(true);
   
   
 } 
}

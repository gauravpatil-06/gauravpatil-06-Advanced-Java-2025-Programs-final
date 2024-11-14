import java.awt.*;

public class ListSeason extends Frame
{
    ListSeason()
    {
        FlowLayout f1 =new FlowLayout();
        setLayout(f1);
        List l1=new List(3,true);
        l1.add("Summer");
        l1.add("Winter");
        l1.add("Rainy");

        
        add(l1);
        
    }
    public static void main(String[] args) 
    {
        ListSeason Ltf=new ListSeason();
        Ltf.setVisible(true);
        Ltf.setTitle("List for Season");    
        Ltf.setSize(500,500);    
    }
}

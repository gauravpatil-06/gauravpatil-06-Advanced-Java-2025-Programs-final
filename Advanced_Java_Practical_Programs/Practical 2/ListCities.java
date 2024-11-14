import java.awt.*;
import java.awt.event.*;

public class ListCities extends Frame
{
    ListCities()
    {  FlowLayout f1 =new FlowLayout();
        setLayout(f1);
        setBackground(Color.cyan);
        List l1=new List(3,true);
        l1.add("Murtizapur");
        l1.add("Shegaon");
        l1.add("Akola");
        l1.add("Pune");
        l1.add("Nagpur");  
        l1.add("Chikhli");
        l1.add("Buldhana");      
        l1.add("Nanded");
        l1.add("Parbhani");
        l1.add("Chhatrapati Sambhajinagar");

        List l2=new List(3,true);
        l2.add("Sakaal");
        l2.add("Lokmat");
        l2.add("Deshonnati");
        l2.add("Hindustan Times");
        l2.add("Times of India");  
        l2.add("Maharashtra Times ");
        l2.add("Loksatta");      
    

        add(l1);
        add(l2);
    }
    
    public static void main(String args[])
    {
        ListCities LC1 =new ListCities();
        LC1.setVisible(true);
        LC1.setTitle("List of 10 different Cities and Newspaper");
        LC1.setSize(500,500);

    }       
}

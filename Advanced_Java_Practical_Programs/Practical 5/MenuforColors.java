import java.awt.*;

public class MenuforColors extends Frame
{
    MenuforColors()
    {
        setLayout(null);
        MenuBar mBar=new MenuBar();
        setMenuBar(mBar);
        Menu m1=new Menu("Colors");
        MenuItem m11=new MenuItem("Red");
        MenuItem m12=new MenuItem("Orange");
        MenuItem m13=new MenuItem("Blue");
        MenuItem m14=new MenuItem("Green");
        MenuItem m15=new MenuItem("Black");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m15);
        mBar.add(m1);
        m15.setEnabled(false);
    }
     public static void main(String[] args)
    {
        MenuforColors MD=new MenuforColors();
        MD.setTitle("Menu Demo For Different Colors");
        MD.setSize(500,500);
        MD.setVisible(true);
    } 
}

import java.awt.*;

class Notepad extends Frame
{
    Notepad()
    {
        FlowLayout f1 = new FlowLayout();
        setLayout(f1);

        setBackground(Color.cyan);

        MenuBar mbr = new MenuBar();

        Menu m1 = new Menu("File");
        MenuItem m11 = new MenuItem("New");
        MenuItem m12 = new MenuItem("Open");
        MenuItem m13 = new MenuItem("Save");
        MenuItem m14 = new MenuItem("Save As");
        MenuItem m15 = new MenuItem("Rename...");
        MenuItem m16 = new MenuItem("Close");

        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m15);
        m1.add(m16);

        Menu m2 = new Menu("Edit");
        MenuItem m21 = new MenuItem("Undo");
        MenuItem m22 = new MenuItem("Redo");
        MenuItem m23 = new MenuItem("Cut");
        MenuItem m24 = new MenuItem("Copy");
        MenuItem m25 = new MenuItem("Paste");
        MenuItem m26 = new MenuItem("Delete");

        m2.add(m21);
        m2.add(m22);
        m2.add(m23);
        m2.add(m24);
        m2.add(m25);
        m2.add(m26);

        Menu m3 = new Menu("Search");
        MenuItem m31 = new MenuItem("Find...");
        MenuItem m32 = new MenuItem("Find Next");
        MenuItem m33 = new MenuItem("Find Previous");

        m3.add(m31);
        m3.add(m32);
        m3.add(m33);

        Menu m4 = new Menu("View");
        Menu m41 = new Menu("Zoom");
        MenuItem m411 = new MenuItem("Zoom In");
        MenuItem m412 = new MenuItem("Zoom Out");

        m41.add(m411);
        m41.add(m412);

        m4.add(m41);

        Menu m5 = new Menu("Language");
        MenuItem m51 = new MenuItem("C Lang");
        MenuItem m52 = new MenuItem("C++ Lang");
        MenuItem m53 = new MenuItem("Java Lang");
        MenuItem m54 = new MenuItem("PHP Lang");
        MenuItem m55 = new MenuItem("Python Lang");

        m5.add(m51);
        m5.add(m52);
        m5.add(m53);
        m5.add(m54);
        m5.add(m55);

        Menu m6 = new Menu("Settings");
        MenuItem m61 = new MenuItem("About us");
        MenuItem m62 = new MenuItem("Contact us");
        MenuItem m63 = new MenuItem("My profile");
        MenuItem m64 = new MenuItem("Log Out");

        m6.add(m61);
        m6.add(m62);
        m6.add(m63);
        m6.add(m64);

        mbr.add(m1);
        mbr.add(m2);
        mbr.add(m3);
        mbr.add(m4);
        mbr.add(m5);
        mbr.add(m6);

        setMenuBar(mbr);
    }

    public static void main(String args[])
    {
        Notepad n1 = new Notepad();

        n1.setVisible(true);
        n1.setTitle("Notepad");
        n1.setSize(600, 600);
    }
}
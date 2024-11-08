import java.awt.*;
import java.awt.event.*;

public class CheckBoxAndRadioButton extends Frame implements ItemListener
{
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox C1;
    Checkbox C2;
    Checkbox C3;
    Checkbox C4;
    Checkbox C5;
    Checkbox C6;
    Checkbox C7;
    Checkbox C8;
    Label L1;

    CheckBoxAndRadioButton()
    {
        FlowLayout F1 = new FlowLayout();
        setLayout(F1);

        C1 = new Checkbox("AJP");
        C2 = new Checkbox("ACN");
        C3 = new Checkbox("EST");
        C6 = new Checkbox("English");
        C7 = new Checkbox("Marathi");
        C8 = new Checkbox("Hindi");
        C4 = new Checkbox("Male", false, cbg);
        C5 = new Checkbox("Female", false, cbg);
        L1 = new Label("                                           ");

        add(C1);
        add(C2);
        add(C3);
        add(C4);
        add(C5);
        add(C6);
        add(C7);
        add(C8);
        add(L1);

        C4.addItemListener(this);
        C5.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie)
    {
        Checkbox x = cbg.getSelectedCheckbox();

        if (x == C4)
        {
            L1.setText("You Selected MALE");
        }
        else if (x == C5)
        {
            L1.setText("You Selected FEMALE");
        }
    }

    public static void main(String args[])
    {
        CheckBoxAndRadioButton C1 = new CheckBoxAndRadioButton();

        C1.setVisible(true);
        C1.setTitle("Checkbox demo");
        C1.setSize(500, 500);
    }
}

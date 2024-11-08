import java.awt.*;
import java.awt.event.*;

public class LoginForm extends Frame implements ActionListener
{
    Label L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15, L16, L17;
    Button B1;
    TextField T1, T2, T3;
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox C1, C2;
    Choice Ch1 = new Choice();

    LoginForm()
    {
        Font f1 = new Font("Aerial Black", Font.BOLD, 20);
        setFont(f1);
        setLayout(null);
        setBackground(Color.YELLOW);

        L1 = new Label("LOGIN FORM ");
        L2 = new Label("Enter Name: ", Label.RIGHT);
        L3 = new Label("Select Gender: ", Label.RIGHT);
        L4 = new Label("Enter Mobile No:", Label.RIGHT);
        L5 = new Label("Enter City:", Label.RIGHT);
        L6 = new Label("                     ");
        L7 = new Label("                     ");
        L8 = new Label("                     ");
        L9 = new Label("                     ");
        L10 = new Label("                    ");
        L11 = new Label("                    ");
        L12 = new Label("                    ");
        L13 = new Label("                    ");
        L14 = new Label("                    ");
        L15 = new Label("Select Semester:", Label.RIGHT);
        L16 = new Label("                    ");
        L17 = new Label("                    ");

        B1 = new Button("Submit");

        T1 = new TextField();
        T2 = new TextField();
        T3 = new TextField();

        C1 = new Checkbox("Male", false, cbg);
        C2 = new Checkbox("Female", false, cbg);

        Ch1.add("Semester 1");
        Ch1.add("Semester 2");
        Ch1.add("Semester 3");
        Ch1.add("Semester 4");
        Ch1.add("Semester 5");
        Ch1.add("Semester 6");

        add(L1);
        add(L2);
        add(L3);
        add(L4);
        add(L5);
        add(L6);
        add(L7);
        add(L8);
        add(L9);
        add(L10);
        add(L11);
        add(L12);
        add(L13);
        add(L14);
        add(L15);
        add(L16);
        add(L17);
        add(B1);
        add(T1);
        add(T2);
        add(T3);
        add(C1);
        add(C2);
        add(Ch1);

        L1.setBounds(300, 100, 150, 50);
        L2.setBounds(50, 200, 200, 50);
        L3.setBounds(50, 270, 200, 50);
        L4.setBounds(50, 340, 200, 50);
        L5.setBounds(50, 410, 200, 50);
        L15.setBounds(50, 480, 200, 50);
        Ch1.setBounds(270, 480, 200, 50);
        B1.setBounds(300, 530, 150, 50);
        T1.setBounds(270, 200, 300, 40);
        C1.setBounds(270, 270, 100, 50);
        C2.setBounds(370, 270, 100, 50);
        T2.setBounds(270, 340, 300, 40);
        T3.setBounds(270, 410, 300, 40);
        L6.setBounds(250, 570, 250, 50);
        L7.setBounds(30, 620, 100, 50);
        L8.setBounds(200, 620, 100, 50);
        L9.setBounds(300, 620, 100, 50);
        L10.setBounds(450, 620, 100, 50);
        L11.setBounds(30, 670, 150, 50);
        L12.setBounds(200, 670, 100, 50);
        L13.setBounds(300, 670, 120, 50);
        L14.setBounds(450, 670, 150, 50);
        L16.setBounds(600, 620, 150, 50);
        L17.setBounds(600, 670, 150, 50);

        B1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        L6.setText("Data Saved Successfully....!");
        L7.setText("Name");
        L8.setText("Gender");
        L9.setText("Mobile No");
        L10.setText("City");
        L16.setText("Semester");

        String name = T1.getText();
        String no = T2.getText();
        String city = T3.getText();
        String sem = Ch1.getSelectedItem();

        L11.setText(name);
        L12.setText(cbg.getSelectedCheckbox().getLabel());
        L13.setText(no);
        L14.setText(city);
        L17.setText(sem);
    }

    public static void main(String args[])
    {
        LoginForm LF = new LoginForm();

        LF.setVisible(true);
        LF.setTitle("Login Form");
        LF.setSize(750, 750);
    }
}

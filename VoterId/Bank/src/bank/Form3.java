package Bank;
import java.awt.*;
import javax.swing.JButton.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Form3 extends JFrame implements ActionListener {
    JLabel a;
    JTextField t1;
    JButton button;
    Form3()
    {
           setTitle("Blood Bank");
           setSize(1365,770);
           setLayout(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

           a = new JLabel("DONOR NO");
           a.setBounds(470,100,200,200);
           a.setFont(new Font("serif",Font.BOLD,25));
             a.setForeground(Color.blue);
            t1 = new JTextField();
           t1.setBounds(700,185,120,30);

         button = new JButton("OK");
          button.setBounds(600,570,100,30);
          add(button);
          // add(t4);
          // add(t5);
          // add(t1);
           add(a);

           add(t1);


           button.addActionListener(this);
      // btn1.addActionListener(this);
        //    btn.addActionListener(this);
            setVisible(true);
    }
      public void actionPerformed(ActionEvent e) {
      new View1();

    }


public void action()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cnt=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE [SYSTEM on SYSTEM]","SYSTEM","nivetha");
            Statement stmt=cnt.createStatement();
            String str1=t1.getText();


            //new Index();
            cnt.close();
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
}
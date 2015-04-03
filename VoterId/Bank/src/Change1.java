package Bank;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Change1 extends JFrame implements ActionListener {
    JLabel a, b , c ;
    JTextField t3;
    JButton button, next;
    Change1()
    {
           setTitle("Blood Bank");
           setSize(1365,770);
           setLayout(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


           a = new JLabel("RECORD INSERTED   !!");
          a.setBounds(540,100,350,200);
           a.setFont(new Font("serif",Font.BOLD,25));
             a.setForeground(Color.blue);


           button = new JButton("OK");
           button.setBounds(600,570,100,30);
           add(button);

           add(a);








           button.addActionListener(this);
                      setVisible(true);

    }
      public void actionPerformed(ActionEvent e) {
      new  Form1();
    }
public void action()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cnt=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE [SYSTEM on SYSTEM]","SYSTEM","nivetha");
            Statement stmt=cnt.createStatement();





            //new Index();
            cnt.close();
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }

     public static void main(String[] args) {
       new  Change1();
    }
}

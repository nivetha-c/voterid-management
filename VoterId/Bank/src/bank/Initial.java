package Bank;
import java.awt.*;
import javax.swing.JButton.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Initial extends JFrame implements ActionListener {

    JLabel a,b;
    JButton btn,btn1;
    Initial()
    {
           setTitle("VOTER ID");
           setSize(1365,770);
           setBackground(Color.red);
           setLayout(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           a = new JLabel("VOTER  ID  VERIFICATION");
           a.setBounds(400,50,800,200);
           a.setFont(new Font("serif",Font.ROMAN_BASELINE,40));
           a.setForeground(Color.RED);
           add(a);
             b = new JLabel("ACCESS  TYPE");
           b.setBounds(550,200,800,200);
           b.setFont(new Font("serif",Font.ROMAN_BASELINE,30));
           b.setForeground(Color.blue);
           add(b);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         btn = new JButton("ADMINISTRATOR");
           btn.setBounds(400,400,200,40);
              btn.setFont(new Font("serif",Font.ROMAN_BASELINE,20));
                btn.setForeground(Color.red);

               btn1 = new JButton("USER");
           btn1.setBounds(700,400,200,40);
              btn1.setFont(new Font("serif",Font.ROMAN_BASELINE,20));
                btn1.setForeground(Color.red);

                                
  add(btn);
  add(btn1);
  btn.addActionListener(this);
  btn1.addActionListener(this);
    btn.setActionCommand("ADMINISTRATOR");
btn1.setActionCommand("USER");
setVisible(true);
    }


 @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()=="ADMINISTRATOR")
                new Login1();
        else 
            new Login();
        
    }
    public void action()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cnt=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","nivetha");
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
        new Initial();

    }
}

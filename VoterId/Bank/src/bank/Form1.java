package Bank;
import java.awt.*;
import javax.swing.JButton.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Form1 extends JFrame implements ActionListener {

    JLabel a;
    JButton btn,btn1,btn2,btn3,btn4;
    Form1()
    {
           setTitle("VOTER ID");
           setSize(1365,770);
           setBackground(Color.red);
           setLayout(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           a = new JLabel("VOTER  ID  VERIFICATION");
           a.setBounds(400,100,800,200);
           a.setFont(new Font("serif",Font.ROMAN_BASELINE,40));
           a.setForeground(Color.RED);
           add(a);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         btn = new JButton("INSERT");
           btn.setBounds(430,350,150,40);
              btn.setFont(new Font("serif",Font.ROMAN_BASELINE,20));
                btn.setForeground(Color.blue);

               btn1 = new JButton("UPDATE");
           btn1.setBounds(730,350,150,40);
              btn1.setFont(new Font("serif",Font.ROMAN_BASELINE,20));
                btn1.setForeground(Color.blue);

                 btn2 = new JButton("VIEW");
           btn2.setBounds(430,500,150,40);
              btn2.setFont(new Font("serif",Font.ROMAN_BASELINE,20));
                btn2.setForeground(Color.blue);
                
                 btn3 = new JButton("SEARCH");
           btn3.setBounds(730,500,150,40);
              btn3.setFont(new Font("serif",Font.ROMAN_BASELINE,20));
                btn3.setForeground(Color.blue);

                btn4 = new JButton("HOME");
           btn4.setBounds(1200,650,100,30);
                      btn4.setFont(new Font("serif",Font.BOLD,15));
           btn4.setForeground(Color.red);
           add(btn4);

                
  add(btn);
  add(btn1);
  add(btn2);
 add(btn3);
 
  btn.addActionListener(this);
  btn1.addActionListener(this);
  btn2.addActionListener(this);
  btn3.addActionListener(this);
  btn4.addActionListener(this);
  btn.setActionCommand("INSERT");
btn1.setActionCommand("UPDATE");
btn2.setActionCommand("VIEW");
  btn3.setActionCommand("SEARCH");
  btn4.setActionCommand("HOME");
setVisible(true);
    }


 @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()=="INSERT")
                new Insert1();
        else if(e.getActionCommand()=="UPDATE")
                new Update1();
       else if(e.getActionCommand()=="VIEW")
                new View1();
       else if(e.getActionCommand()=="SEARCH")
           new Form();
        else
           new Initial();
        
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
        new Form1();

    }
}

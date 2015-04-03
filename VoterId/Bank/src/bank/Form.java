package Bank;
import java.awt.*;
import javax.swing.JButton.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Form extends JFrame implements ActionListener {

    JLabel a;
    JButton btn,btn1,btn2;
    Form()
    {
           setTitle("VOTER ID");
           setSize(1365,770);
           setBackground(Color.red);
           setLayout(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           a = new JLabel("SEARCH  BY...");
           a.setBounds(550,100,800,200);
           a.setFont(new Font("serif",Font.ROMAN_BASELINE,30));
           a.setForeground(Color.BLUE);
           add(a);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         btn = new JButton("DISTRICT");
           btn.setBounds(600,300,150,40);
              btn.setFont(new Font("serif",Font.ROMAN_BASELINE,20));
                btn.setForeground(Color.red);

               btn1 = new JButton("AGE");
           btn1.setBounds(600,400,150,40);
              btn1.setFont(new Font("serif",Font.ROMAN_BASELINE,20));
                btn1.setForeground(Color.red);
                
                 btn2 = new JButton("HOME");
           btn2.setBounds(1200,650,100,30);
                      btn2.setFont(new Font("serif",Font.BOLD,15));
           btn2.setForeground(Color.red);
           add(btn2);


                 
  add(btn);
  add(btn1);
  
  btn.addActionListener(this);
  btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn.setActionCommand("DISTRICT");
btn1.setActionCommand("AGE");
btn2.setActionCommand("HOME");
setVisible(true);
    }


 
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()=="DISTRICT")
                new Search1();
        else if (e.getActionCommand()=="AGE")
                new Search2();
        else
            new Form1();
        
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
        new Form();

    }
}

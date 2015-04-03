package Bank;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class View1 extends JFrame implements ActionListener {
    JLabel a, b , c , d,e,f,g,tit,h;
    JTextField t1, t2 ,t3,t4,t5,t6,t7,t8;
    JButton button,btn,btn1;
  View1()
    {
           setTitle("VOTER ID");
           setSize(1365,770);
           setLayout(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tit = new JLabel("VIEWING  TNE  DATA");
           tit.setBounds(500,50,500,30);
              tit.setFont(new Font("serif",Font.BOLD,25));
                tit.setForeground(Color.red);
           a = new JLabel("ID NO");
           a.setBounds(450,150,300,30);
           a.setFont(new Font("serif",Font.BOLD,25));
             a.setForeground(Color.blue);
           b = new JLabel("ELECTOR'S NAME");
           
           b.setBounds(450,200,300,30);
           b.setFont(new Font("serif",Font.BOLD,25));
             b.setForeground(Color.blue);
           c = new JLabel("FATHER'S NAME");
           c.setBounds(450,250,300,30);
           c.setFont(new Font("serif",Font.BOLD,25));
             c.setForeground(Color.blue);
           d = new JLabel("SEX");
           d.setBounds(450,300,300,30);
           d.setFont(new Font("serif",Font.BOLD,25));  d.setForeground(Color.blue);
           e = new JLabel("DATE OF BIRTH");
           e.setBounds(450,350,300,30);
           e.setFont(new Font("serif",Font.BOLD,25));  e.setForeground(Color.blue);
           f = new JLabel("ADDRESS");
           f.setBounds(450,400,300,30);
           f.setFont(new Font("serif",Font.BOLD,25));  f.setForeground(Color.blue);
           g = new JLabel("TALUK");
           g.setBounds(450,450,300,30);
           g.setFont(new Font("serif",Font.BOLD,25));  g.setForeground(Color.blue);
            h = new JLabel("DISTRICT");
           h.setBounds(450,500,300,30);
           h.setFont(new Font("serif",Font.BOLD,25));  h.setForeground(Color.blue);

           t1 = new JTextField();
           t1.setBounds(600,150,250,30);
           t1.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t1.setForeground(Color.black);
           t2 = new JTextField();
           t2.setBounds(700,200,400,30);
           t2.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t2.setForeground(Color.black);
           t3 = new JTextField();
           t3.setBounds(700,250,400,30);
           t3.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t3.setForeground(Color.black);
           t4 = new JTextField();
           t4.setBounds(700,300,400,30);
           t4.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t4.setForeground(Color.black);
           t5 = new JTextField();
           t5.setBounds(700,350,400,30);
           t5.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t5.setForeground(Color.black);
           t6 = new JTextField();
           t6.setBounds(700,400,400,30);
           t6.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t6.setForeground(Color.black);
           t7=new JTextField();
           t7.setBounds(700,450,400,30);
           t7.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t7.setForeground(Color.black);
           t8=new JTextField();
           t8.setBounds(700,500,400,30);
           t8.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t8.setForeground(Color.black);
            button = new JButton("OK");
           button.setBounds(600,600,100,30);
         
         btn1 = new JButton("HOME");
           btn1.setBounds(1200,650,100,30);
                      btn1.setFont(new Font("serif",Font.BOLD,15));
           btn1.setForeground(Color.red);
           add(btn1);

          

           
            btn=new JButton("SUBMIT");
            btn.setBounds(550,250,100,30);
           
            add(btn);
             add(a);
          add(t1);
        
         
          button.addActionListener(this);
           btn.addActionListener(this);
           btn1.addActionListener(this);
             btn.setActionCommand("SUBMIT");
             btn1.setActionCommand("HOME");
             button.setActionCommand("OK");
               setVisible(true);
          

    }
      public void actionPerformed(ActionEvent e) {
              if (e.getActionCommand()=="SUBMIT")
              
              
               action();
              
              else if (e.getActionCommand()=="OK")
              {
             JOptionPane.showMessageDialog(null, "DATA VIEWED");
      new Form1();
              }
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
            String str1=t1.getText();
            setVisible(false);
                a.hide();
              t1.hide();
              btn.hide();
            
   
        
          ResultSet rs=  stmt.executeQuery("select * from voter_id where id_no = '"+str1+"' "); 
          while(rs.next())
          {
              String str2=rs.getString(2);
            String str3=rs.getString(3);
            String str4=rs.getString(4);
            String str5=rs.getString(5);
            String str6=rs.getString(6);
            String str7=rs.getString(7);
            String str8=rs.getString(8);
             add(b);
           add(c);
           add(d);
           add(e);
           add(f);
     
           add(g);
                   add(h);
            t2.setText(str2);
            t3.setText(str3);
            t4.setText(str4);
            t5.setText(str5);
            t6.setText(str6);
            t7.setText(str7);
            t8.setText(str8);
             add(t4);
           add(t5);
           
                     
           add(t4);
           add(t5);
 add(t7);
           add(t2);
           add(t3);
           add(t6);
           add(tit);
           
           add(t8);
           add(button);
           
             setVisible(true);
          }
            cnt.close();
            
                 
                   
            
        }
        catch(NumberFormatException e)
        {
             JOptionPane.showMessageDialog(null, "The Given Data is INAVLID!!! Enter the Valid Data");
             System.out.println(e);
        }
         catch(SQLException e)
        {
             JOptionPane.showMessageDialog(null, "Enter the Valid Data ");
             System.out.println(e);
        }
        catch(Exception e)
        { 
            JOptionPane.showMessageDialog(null,"Please verify your Connection");
            System.out.println("Error"+e);
        }
    }

     public static void main(String[] args) {
       new View1();
    }
}

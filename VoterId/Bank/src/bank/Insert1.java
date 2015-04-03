package Bank;
import java.awt.*;
import javax.swing.JButton.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Insert1 extends JFrame implements ActionListener {
    JLabel tit,a, b , c , d,e,f,g,h;
    JTextField t1, t2 ,t3,t4,t5,t6,t7,t8;
    JButton button,btn;
    Insert1()
    {
           setTitle("VOTER ID");
           setSize(1365,770);
           setLayout(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //   btn = new JButton("INSERT");
        //   btn.setBounds(600,50,300,30);
        //      btn.setFont(new Font("serif",Font.BOLD,25));
          //      btn.setForeground(Color.red);
            tit = new JLabel("INSERT  THE  RECORDS...");
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
           t1.setBounds(700,150,250,30);
            t1.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t1.setForeground(Color.black);
           t2 = new JTextField();
           t2.setBounds(700,200,250,30);
            t2.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t2.setForeground(Color.black);
           t3 = new JTextField();
           t3.setBounds(700,250,250,30);
            t3.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t3.setForeground(Color.black);
           t4 = new JTextField();
           t4.setBounds(700,300,250,30);
            t4.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t4.setForeground(Color.black);
           t5 = new JTextField();
           t5.setBounds(700,350,250,30);
            t5.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t5.setForeground(Color.black);
           t6 = new JTextField();
           t6.setBounds(700,400,250,30);
            t6.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t6.setForeground(Color.black);
           t7=new JTextField();
           t7.setBounds(700,450,250,30);
            t7.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t7.setForeground(Color.black);
           t8=new JTextField();
           t8.setBounds(700,500,250,30);
            t8.setFont(new Font("serif",Font.ROMAN_BASELINE,20));  t8.setForeground(Color.black);
            button = new JButton("SUBMIT");
           button.setBounds(600,600,150,30);
                      button.setFont(new Font("serif",Font.BOLD,15));
           button.setForeground(Color.red);
            btn = new JButton("HOME");
           btn.setBounds(1200,650,100,30);
                      btn.setFont(new Font("serif",Font.BOLD,15));
           btn.setForeground(Color.red);
        // btn1 = new JButton("UPDATE");
          // btn1.setBounds(760,570,100,30);
           add(btn);
          add(button);
          // add(t4);
          // add(t5);
          add(tit);
           add(a);
           add(b);
           add(c);
           add(d);
           add(e);
           add(g);
           add(t7);
           add(t4);
           add(t5);
           add(t1);
           add(t2);
           add(t3);
           add(t6);
          // add(btn);
           add(f);
           add(h);
           add(t8);
           //add(btn1);


         


        
       
       
          button.addActionListener(this);
            button.setActionCommand("SUBMIT");
             btn.addActionListener(this);
            btn.setActionCommand("HOME");
      // btn1.addActionListener(this);
        //    btn.addActionListener(this);
            setVisible(true);
    }
      public void actionPerformed(ActionEvent e) {
           if (e.getActionCommand()=="SUBMIT")
           {
               action();
           new Form1();
           }
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
            String str1=t1.getText();
            String str2=t2.getText();
            String str3=t3.getText();
            String str4=t4.getText();
            String str5=t5.getText();
            String str6=t6.getText();
            String str7=t7.getText();
            String str8=t8.getText();
               stmt.executeUpdate("insert into voter_id(id_no,name,fm,sex,db,adrs,taluk,district) values ('"+str1+"','"+str2+"','"+str3+"','"+str4+"','"+str5+"','"+str6+"','"+str7+"','"+str8+"')");
            
            cnt.close();
             JOptionPane.showMessageDialog(null, "DATA INSERTED");
            
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
       new Insert1();
    }
}


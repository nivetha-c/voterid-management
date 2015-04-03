package Bank;
import Bank.View;
import javax.swing.JButton.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Update extends JFrame implements ActionListener {
    JLabel a, b , c , d,e,f,g,tit,h;
    JTextField t1, t2 ,t3,t4,t5,t6,t7;
    JButton button;
    Update()
    {
           setTitle("Blood Bank");
           setSize(1365,770);
           setLayout(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tit = new JLabel("UPDATE");
           tit.setBounds(600,50,300,30);
              tit.setFont(new Font("serif",Font.BOLD,25));
                tit.setForeground(Color.red);
           a = new JLabel("DONOR NO");
           a.setBounds(470,100,200,200);
           a.setFont(new Font("serif",Font.BOLD,25));
             a.setForeground(Color.blue);
           

           b = new JLabel("DONOR NAME");
           b.setBounds(470,250,200,30);
           b.setFont(new Font("serif",Font.BOLD,25));
             b.setForeground(Color.blue);
           c = new JLabel("BLOOD GROUP");
           c.setBounds(470,320,200,30);
           c.setFont(new Font("serif",Font.BOLD,25));
             c.setForeground(Color.blue);
           d = new JLabel("CITY NAME");
           d.setBounds(470,370,200,30);
           d.setFont(new Font("serif",Font.BOLD,25));  d.setForeground(Color.blue);
           e = new JLabel("GENDER");
           e.setBounds(470,420,200,30);
           e.setFont(new Font("serif",Font.BOLD,25));  e.setForeground(Color.blue);
           f = new JLabel("AGE");
           f.setBounds(470,470,200,30);
           f.setFont(new Font("serif",Font.BOLD,25));  f.setForeground(Color.blue);
           g = new JLabel("CONTACT NO");
           g.setBounds(470,500,200,30);
           g.setFont(new Font("serif",Font.BOLD,25));  g.setForeground(Color.blue);
           t1 = new JTextField();
           t1.setBounds(700,185,120,30);
           t2 = new JTextField();
           t2.setBounds(700,250,120,30);
           t3 = new JTextField();
           t3.setBounds(700,320,120,30);
           t4 = new JTextField();
           t4.setBounds(700,370,120,30);
           t5 = new JTextField();
           t5.setBounds(700,420,120,30);
           t6 = new JTextField();
           t6.setBounds(700,470,120,30);
           t7=new JTextField();
           t7.setBounds(700,500,120,30);
            button = new JButton("SUBMIT");
           button.setBounds(600,570,100,30);
          add(button);
           add(t4);
           add(t5);
           add(t1);
           add(a);
           add(b);
           add(c);
           add(d);
           add(e);
           add(t2);
           add(t3);
           add(t6);
           add(tit);
           add(f);
      
           button.addActionListener(this);
   
                      setVisible(true);

    }
      public void actionPerformed(ActionEvent e) {
      new View();
    }
public void action()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cnt=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.30:1521:oracle","user4","user4");
            Statement stmt=cnt.createStatement();
            String str1=t1.getText();
            String str2=t2.getText();
            String str3=t3.getText();
            String str4=t4.getText();
            String str5=t5.getText();
            String str6=t6.getText();
            String str7=t7.getText();
            stmt.executeUpdate("update into table name values(donor name,age,gender,city name,blood group,contactno) values ('"+str1+"','"+str2+"','"+str3+"','"+str4+"','"+str5+"','"+str6+"','"+str7+"')");
            //new Index();
            cnt.close();
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }

     public static void main(String[] args) {
       new Update();
    }
}


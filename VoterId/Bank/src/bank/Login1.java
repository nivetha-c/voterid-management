package Bank;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Login1 extends JFrame implements ActionListener {
    JLabel a, b,c;
    JTextField t1;
    JButton btn1,btn2;
    JPasswordField p1;
    Login1()
    {
           setTitle("VOTER ID");
           setSize(1365,770);
           setLayout(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             a = new JLabel("LOGIN  FORM");
           a.setBounds(10,50,200,30);
           a.setFont(new Font("serif",Font.BOLD,15));
             a.setForeground(Color.blue);
             
           b = new JLabel("USER NAME");
           b.setBounds(170,50,200,30);
           b.setFont(new Font("serif",Font.BOLD,15));
             b.setForeground(Color.blue);
           c = new JLabel("ENTER  THE  PASSWORD");
           c.setBounds(500,150,500,30);
           c.setFont(new Font("serif",Font.ROMAN_BASELINE,30));
             c.setForeground(Color.blue);
           

           t1 = new JTextField();
           t1.setBounds(10,150,100,30);
           p1=new JPasswordField();
           p1.setBounds(550,250,200,30);
         
         
          

           
            btn1=new JButton("SUBMIT");
            btn1.setBounds(600,350,100,30);
           
            
                      btn1.setFont(new Font("serif",Font.BOLD,15));
           btn1.setForeground(Color.red);
             btn2 = new JButton("HOME");
           btn2.setBounds(1200,650,100,30);
                      btn2.setFont(new Font("serif",Font.BOLD,15));
           btn2.setForeground(Color.red);
           add(btn2);
           add(btn1);
           //add(a);
          // add(b);
           add(c);
         //  add(t1);
           add(p1);
           btn1.addActionListener(this);
           btn2.addActionListener(this);
           btn1.setActionCommand("SUBMIT");
           btn2.setActionCommand("HOME");
           setVisible(true);
            }
      public void actionPerformed(ActionEvent e) {
             if (e.getActionCommand()=="SUBMIT")
                action();
             else
                 new Initial();
              }
public void action()
    {
       JFrame f1=new JFrame();
       JLabel a,b;
      // String str1=t1.getText();
       char[]p=p1.getPassword();
       String str2=new String(p);
       
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cnt=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","nivetha");
            PreparedStatement ps=cnt.prepareStatement("select * from reg2 where pwd=?");
           // ps.setString(1,str1);
            ps.setString(1,str2);
            ResultSet rs=ps.executeQuery();
           if(rs.next())
           {
               f1.setVisible(true);
               f1.setSize(600,600);
               f1.setLayout(null);
               a=new JLabel();
               b=new JLabel("YOU  HAVE  LOGGED  IN");
               b.setForeground(Color.blue);
               b.setFont(new Font("serif",Font.BOLD,30));
               b.setBounds(60,50,400,30);
               a.setText("WELCOME"+rs.getString(1));
               a.setForeground(Color.red);
               a.setFont(new Font("serif",Font.BOLD,30));
               new Form1();
           }
           else
           {
                JOptionPane.showMessageDialog(null, "INCORRECT username or password!!! TRY AGAIN");
                 new Login1();
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
       new Login1();
    }
}


package Bank;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Search2 extends JFrame implements ActionListener {
    JLabel a, b,c,d,e,f,g,h,b1,i;
    JTextField t1, t2,t3,t4,t5,t6,t7,t8,t9;
    JButton button, btn,btn1;
    Search2()
    {
           setTitle("VOTER ID");
           setSize(1365,770);
           setLayout(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             a = new JLabel("ID NO");
           a.setBounds(10,50,200,30);
           a.setFont(new Font("serif",Font.BOLD,15));
             a.setForeground(Color.blue);
           b = new JLabel("ELECTOR'S NAME");
           
           b.setBounds(170,50,200,30);
           b.setFont(new Font("serif",Font.BOLD,15));
             b.setForeground(Color.blue);
           c = new JLabel("FATHER'S NAME");
           c.setBounds(370,50,200,30);
           c.setFont(new Font("serif",Font.BOLD,15));
             c.setForeground(Color.blue);
           d = new JLabel("SEX");
           d.setBounds(570,50,200,30);
           d.setFont(new Font("serif",Font.BOLD,15));  d.setForeground(Color.blue);
           e = new JLabel("DATE OF BIRTH");
           e.setBounds(720,50,150,30);
           e.setFont(new Font("serif",Font.BOLD,15));  e.setForeground(Color.blue);
           f = new JLabel("ADDRESS");
           f.setBounds(940,50,200,30);
           f.setFont(new Font("serif",Font.BOLD,15));  f.setForeground(Color.blue);
           g = new JLabel("TALUK");
           g.setBounds(1100,50,200,30);
           g.setFont(new Font("serif",Font.BOLD,15));  g.setForeground(Color.blue);
            h = new JLabel("DISTRICT");
           h.setBounds(1240,50,200,30);
           h.setFont(new Font("serif",Font.BOLD,15));  h.setForeground(Color.blue);
  i = new JLabel("AGE");
           i.setBounds(450,150,300,30);
           i.setFont(new Font("serif",Font.BOLD,15));  h.setForeground(Color.blue);

           t1 = new JTextField();
           t1.setBounds(10,150,100,30);
           t2 = new JTextField();
           t2.setBounds(110,150,250,30);
           t3 = new JTextField();
           t3.setBounds(370,150,250,30);
           t4 = new JTextField();
           t4.setBounds(610,150,60,30);
           t5 = new JTextField();
           t5.setBounds(680,150,150,30);
           t6 = new JTextField();
           t6.setBounds(840,150,300,30);
           t7=new JTextField();
           t7.setBounds(1180,150,100,30);
           t8=new JTextField();
           t8.setBounds(700,550,120,30);
            t9=new JTextField();
           t9.setBounds(600,150,250,30);
            button = new JButton("OK");
           button.setBounds(600,590,100,40);
         
         
          

           
            btn=new JButton("SUBMIT");
            btn.setBounds(550,250,100,30);
           
            btn1 = new JButton("HOME");
           btn1.setBounds(1200,650,100,30);
                      btn1.setFont(new Font("serif",Font.BOLD,15));
           btn1.setForeground(Color.red);
           add(btn1);
         add(btn1);
            add(btn);
             add(i);
             
             add(t9);
          
        
         
          button.addActionListener(this);
           btn.addActionListener(this);
              btn1.addActionListener(this);
             btn.setActionCommand("SUBMIT");
             button.setActionCommand("OK");
             btn1.setActionCommand("HOME");
               setVisible(true);
            }
      public void actionPerformed(ActionEvent e) {
             if (e.getActionCommand()=="SUBMIT")
              
              
               action();
              
             else if (e.getActionCommand()=="OK")
              {
             JOptionPane.showMessageDialog(null, "DATA VIEWED");
      new Form();
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
            String str9=t9.getText();
           
                        setVisible(false);
            i.hide();
            t9.hide();
             btn.hide();
            
            ResultSet rs=stmt.executeQuery("select * from voter_id where age = "+str9+" ");
int x,y=100;
 while(rs.next())
          {
             
              x=0;
              for(int i=1;i<=8;i++)
              {
              b1=new JLabel();
              b1.setBounds(x,y,195,30);
              b1.setText(rs.getString(i));
              add(b1);
              x+=180;
              }
              y+=100;
              
//            str2=rs.getString(2);
//            String str3=rs.getString(3);
//            String str4=rs.getString(4);
//            String str5=rs.getString(5);
//            String str6=rs.getString(6);
//              a1=Integer.parseInt(str6);
//            String str7=rs.getString(7);
//            a2=Integer.parseInt(str7);
//            String str8=rs.getString(8);
//             t2.setText(str2);
//            t3.setText(str3);
//            t4.setText(str4);
//            t5.setText(str5);
//            t6.setText(str6);
//            t7.setText(str7);
//            t8.setText(str8);
         
           
             setVisible(true);
          }
     add(b);
     add(a);
           add(c);
           add(d);
           add(e);
           add(f);
     
           add(g);
           add(h);
                  
//             add(t4);
//           add(t5);
//           
//                     
//           add(t4);
//           add(t5);
// add(t7);
//           add(t2);
//           add(t3);
//           add(t6);
//           
//           
//           add(t8);
           add(btn1);
           add(button);
  setVisible(true);
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
       new  Search2();
    }
}


package Bank;
import java.awt.*;
import javax.swing.JButton.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Bank extends JFrame implements ActionListener {
    JLabel a, b , c , d,e,f,g;
    JTextField t1, t2 ,t3,t4,t5,t6,t7;
    JButton button, btn,btn1;
    Bank()
    {
           setTitle("Blood Bank");
           setSize(1365,770);
           setLayout(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         btn = new JButton("INSERT");
           btn.setBounds(600,50,300,30);
              btn.setFont(new Font("serif",Font.BOLD,25));
                btn.setForeground(Color.red);

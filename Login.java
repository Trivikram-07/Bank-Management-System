package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JButton sup,login,clear;                                            //we define like this so that we can access they in the 
    JTextField  cardbox;                                          // login function ,actionPerformed block   now wehave no need to ttype jbutton in function login  
    JPasswordField pinbox;
                                                                           
    Login() {
        setTitle("ATM");
        setLayout(null);

        ImageIcon i1 = new ImageIcon("C:\\Users\\sudha\\OneDrive\\Documents\\NetBeansProjects\\bank management system\\src\\bank\\management\\system\\atm.jpg");
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);//image size
        ImageIcon i3= new ImageIcon(i2);//image to image icon
        JLabel label = new JLabel(i3);//image icon to label
        label.setBounds(70,10,100,100);//to use it use setlayout null as above
        
        JLabel text=new JLabel("welcome to ATM");                                           //welcome label
        text.setFont(new Font("OSWARD",Font.BOLD,38)); //new font and size of char
        text.setBounds(200,40,400,40);//label size and location
        add(text);
        
         JLabel cardno=new JLabel("Card No.");                                             //card no label
        cardno.setFont(new Font("OSWARD",Font.BOLD,26)); //new font and size of char
        cardno.setBounds(120,160,200,40);//label size and location
        add(cardno);
        
         JLabel pin=new JLabel("PIN:");                                                          //pin label
         pin.setFont(new Font("OSWARD",Font.BOLD,26)); //new font and size of char
        pin.setBounds(120,240,200,40);//label size and location
        add(pin);
        
        cardbox=new JTextField();                                                        //cardbox
        cardbox .setBounds(320,160,200,40);
         cardbox.setFont(new Font("ARIAL",Font.BOLD,16));
        add(cardbox);
        
           pinbox=new JPasswordField();                                                    //pinbox
        pinbox .setBounds(320,240,200,40);
         pinbox.setFont(new Font("ARIAL",Font.BOLD,16));
        add(pinbox);
        
        
        login=new JButton("Login");
        login.setBounds(300,300,100,30);                                                              // login button
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
         clear=new JButton("CLEAR");
        clear.setBounds(360,350,100,30);                                                              // CLEAR button
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
         sup=new JButton("SIGN UP");
        sup.setBounds(420,300,100,30);                                                              // CLEAR button
        sup.setBackground(Color.BLACK);
        sup.setForeground(Color.WHITE);
        sup.addActionListener(this);
        add(sup);
        
        
        
        getContentPane().setBackground(Color.white);
        add(label);

        setSize(800, 480);
        setVisible(true);
        setLocationRelativeTo(null);
    }
          public void actionPerformed(ActionEvent ae){                                 //it is mandatory line if you impliment actionListener
          try{                                                                             // if you use sql you should use try and catch 
              if(ae.getSource()==login){
                  Conn c1 = new Conn();
                String cardno  = cardbox.getText();
                String pin  = pinbox.getText();                                        //you get get text with a strike beacause it is password dont worry it works like this too
                String q  = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
//here card_number = '"+cardno+"'  which means first is the name in the sql table and after = it is the name where we store the value of text field
                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new transaction(pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
              }
              else if(ae.getSource()==sup){
              setVisible(false);
              new signup1().setVisible(true);
              }
              else if(ae.getSource()==clear){
              cardbox.setText("");
               pinbox.setText("");
              }
              
        }
          catch(Exception e){
              System.out.println(e);
              
          }
          }

    public static void main(String args[]) {
        new Login(); 
    }
}

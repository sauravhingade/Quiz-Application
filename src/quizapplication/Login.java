
package quizapplication;
import javax.swing.*;  //to import jframe class , jframe class is use to creatre the frame 
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame  implements ActionListener {
    JButton rules,back;
    JTextField tfname;
    
    Login(){
         
        getContentPane().setBackground(Color.white);       // set background color using the method of awt package
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/login.jpeg"));  // imageicon is yhe class of JFrame use to pick the image 
        JLabel image=new JLabel(i1);  // we can not use the i1 object directly in the add class so we need to first put it in jlabel calass
          add(image);                      //add the image on the top of frame
          
        
         JLabel heading =new JLabel("Simple Minds");                                    // jlabel is use to write anythimg on the frame
          heading.setBounds(750,60 ,300 ,45);
          heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
          heading.setForeground(new Color(30,144,254));
          add(heading);
          
            JLabel name =new JLabel("Enter your name");                                    // jlabel is use to write anythimg on the frame
          name.setBounds(810,150 ,300 ,20);
          name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
          name.setForeground(new Color(30,144,254));
          add(name);
          
         tfname=new JTextField();                                              //jtextfield is class use to take text input 
          tfname.setBounds(735,200,300,25);
          tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
          add(tfname);
          
          rules =new JButton("Rules");
          rules.setBounds(735,270,120,25);
          rules.setBackground(new Color(30,144,254));
           rules.setForeground(Color.white);
           rules.addActionListener(this);
          add(rules);
          
            back=new JButton("Back");
          back.setBounds(915,270,120,25);
         back.setBackground(new Color(30,144,254));
         back.setForeground(Color.white);
          back.addActionListener(this);
          add(back);
          
      
        image.setBounds(0,0,600,500);
        
        
        
        setVisible(true);    //by default fram is hidden so make it vissible
        setSize(1200,500);  //frame size
        setLocation(200,150);      // frame location
        
       
      
    }
     public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==rules){
                String name=tfname.getText();
                setVisible(false);
                new Rules(name);
            }
            else if(ae.getSource()==back){
                setVisible(false);
            }
        }
       
    public static void main(String[] args){
        new Login();
    }
    
}

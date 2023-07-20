package quizapplication;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score  extends JFrame implements ActionListener{
    
    
    Score(String name ,int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
       
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icon/score.png"));  // imageicon is yhe class of JFrame use to pick the image 
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);  // we can not use the i1 object directly in the add class so we need to first put it in jlabel calass
        image.setBounds(0,200,300,250);
        add(image);                      //add the image on the top of frame
        
        JLabel heading=new JLabel("Thank you "+name+ " for playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahona",Font.PLAIN,26));
        add(heading);
        
          JLabel lblscore=new JLabel("Your Score is "+score);
       lblscore.setBounds(350,200,300,30);
       lblscore.setFont(new Font("Tahona",Font.PLAIN,26));
        add(lblscore);
        
       JButton  submit =new JButton("Play Again");
       submit.setBounds(380,270,120,30);
       
        submit.setBackground(new Color(30,144,255));
       submit.setForeground(Color.white);
        
       submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args){
        new Score("user",0);
    }
    
}

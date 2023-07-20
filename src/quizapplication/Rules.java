
package quizapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start,back;
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
          JLabel heading =new JLabel("Welcome "+name+" to Simple Minds");   // jlabel is use to write anythimg on the frame
          heading.setBounds(50,20,700 ,30);
          heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
          heading.setForeground(new Color(30,144,254));
          add(heading);
          
           JLabel rules =new JLabel();                                    // jlabel is use to write anythimg on the frame
         rules.setBounds(20,90,700 ,350);
          rules.setFont(new Font("Tahoma",Font.PLAIN,16));
         
          rules.setText(
                  "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
          );
          add(rules);
          
          
           start =new JButton("Start");
          start.setBounds(400,500,100,30);
          start.setBackground(new Color(30,144,254));
           start.setForeground(Color.white);
           start.addActionListener(this);
          add(start);
          
            back=new JButton("Back");
          back.setBounds(250,500,100,30);
         back.setBackground(new Color(30,144,254));
         back.setForeground(Color.white);
          back.addActionListener( this);
          add(back);
          
        setLocation(350,100);
        setVisible(true);
        setSize(800,650);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start)
        {
            setVisible(false);
            new Quiz(name);
        }
        else if(ae.getSource()==back)
        {
              setVisible(false);
             new Login();
            
        }
    }
    
    
    public static void main(String[]args)
    {
        new Rules("user");
    }
}

package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton back,start;
    
    Rules(String name){
    
        this.name = name;
        setSize(800,600);
        setLocation(300,80);
        setVisible(true);
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds"); 
        heading.setBounds(50,10,800,50); //to set positiom on the frame
        heading.setFont(new Font("Mongolain Biati", Font.PLAIN, 28)); // to set font 
        heading.setForeground(new Color(30,114,255)); //fontcolor
        add(heading); //add is used to show the component into the frame
        
        JLabel rules = new JLabel(); 
        rules.setBounds(20,30,700,450); //to set positiom on the frame
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16)); // to set font 
        rules.setText(
        
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing good" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what others knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules); //add is used to show the component into the frame
        
        
        back = new JButton("Back");
        back.setBounds(250, 450,120,30);
        back.setBackground(new Color(30,114,255));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(450, 450,120,30);
        start.setBackground(new Color(30,114,255));
        start.setForeground(Color.white);
        start.addActionListener(this);
        add(start);
        
        
        
    }        
    
    public void actionPerformed(ActionEvent ae){
            
            if(ae.getSource() == start){
                setVisible(false);
                new Quiz(name);
                
            }else if(ae.getSource() == back){
                setVisible(false);
                new Login();
            } 
        }
    
    public static void main(String[] args){
        new Rules("User");
    } 
}

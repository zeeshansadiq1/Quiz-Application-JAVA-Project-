package quiz.application;

import javax.swing.*; // to import extends package like JFRAME
import java.awt.*;      //package to add colors
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{    
    
   JButton back, rules;
   JTextField tfname;
    Login(){
        
        //getContentPane() is used to select whole frame
        getContentPane().setBackground(Color.white);
        
        
        //ImageIcon is a class derived from JFRAME pacakge of java
        //ClassLoader is finction and getsystemresouce is used to get path of the file
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        
        //to put the \image on the frame we have to treat the image as a component. only components are placed in the frame
        //we use add() function for this purpose
        //  add(i);  we cannot use the object directly in the ada function so 
        // we create JLAbel variable and pas the image in it
        
        JLabel image = new JLabel(i);
                
        //our image at the center of the frame because of the the buildin structure
                
        //we set layout null so that we create own layout
        setLayout(null);
        image.setBounds(0,0, 600,500);
        add(image);
        
        
        //we use jlabel to write anything into the frame 
        
        JLabel heading = new JLabel("Simple Minds"); 
        heading.setBounds(750,60,300,45); //to set positiom on the frame
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40)); // to set font 
        heading.setForeground(new Color(30,114,255)); //fontcolor
        add(heading); //add is used to show the component into the frame
        
        
        JLabel name = new JLabel("Enter your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolain Biati", Font.BOLD, 18));
        name.setForeground(new Color(30,114,255));
        add(name);
        
        
        tfname = new JTextField();
        tfname.setBounds(735, 180,300,25);
        tfname.setFont(new Font("New TImes Roman", Font.ITALIC , 18));
        add(tfname);
        
        
        rules = new JButton("Next");
        rules.setBounds(915, 240,120,25);
        rules.setBackground(new Color(30,114,255));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);
        
        
        back = new JButton("Back");
        back.setBounds(735, 240,120,25);
        back.setBackground(new Color(30,114,255));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        

        setSize(1200, 500); // to set the the size of the frame 
        setLocation(100,150); // set the locaiton of the frame
        setVisible(true); // to show the frame , by default fraem is hidden
    }
    

      public void actionPerformed(ActionEvent ae){
            
            if(ae.getSource() == rules){
                String name = tfname.getText();
                setVisible(false);
                new Rules(name);
                
            }else if(ae.getSource() == back){
                setVisible(false);
            } 
        }
      
      
    public static void main(String[] args){
        new Login();    //anonyms object
        
    }
}

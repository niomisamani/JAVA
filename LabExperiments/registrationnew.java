/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExperiments;

/**
 *
 * @author niomi
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener
{
    Container c;
    JLabel title;
    JLabel name;
    JLabel contact;
    JLabel gender;
    JTextField tname;
    JTextField tno;
    JRadioButton male;
    JRadioButton female;
    ButtonGroup gengp;
    JButton sub;
    public MyFrame()
    {
        setTitle("Registration form");
        setBounds(300, 90, 500, 400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c=getContentPane();
        c.setLayout(null);
        
        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial" , Font.PLAIN,30));
        title.setSize(300, 30);
        title.setLocation(100, 30);
        c.add(title);
 
        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
 
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(150, 20);
        tname.setLocation(200, 100);
        c.add(tname);
 
        contact = new JLabel("Mobile");
        contact.setFont(new Font("Arial", Font.PLAIN, 20));
        contact.setSize(100, 20);
        contact.setLocation(100, 150);
        c.add(contact);
 
        tno = new JTextField();
        tno.setFont(new Font("Arial", Font.PLAIN, 15));
        tno.setSize(150, 20);
        tno.setLocation(200, 150);
        c.add(tno);
 
        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        c.add(gender);
 
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        c.add(male);
 
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        c.add(female);
 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(200, 250);
        sub.addActionListener(this);
        c.add(sub);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            String data1;
            String nameout=tname.getText();
            String num=tno.getText();
            if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";
            System.out.println(nameout+"\n"+num+"\n"+data1);
 
                
            }
            
}


}

public class registrationnew {
    public static void main(String[] args) throws Exception
    {
        new MyFrame();
    }
    
}

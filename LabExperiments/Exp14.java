/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExperiments;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author niomi
 */
public class Exp14 {
    public static void main(String[] args) {
        //Flow Layout
        JFrame flow = new JFrame("Flow Layout");
        flow.setLayout(new FlowLayout());
        flow.add(new JButton("Button 1"));
        flow.add(new JButton("Button 2"));
        flow.add(new JButton("Button 3"));
        flow.pack();
        flow.setVisible(true);
        flow.setResizable(false);

        
        //Grid Layout
        /*JFrame grid = new JFrame ("Grid Layout");
        grid.setLayout(new GridLayout(2,2));
        grid.add(new JButton("Button 1"));
        grid.add(new JButton("Button 2"));
        grid.add(new JButton("Button 3"));
        grid.add(new JButton("Button 4"));
        grid.pack();
        grid.setVisible(true);
        grid.setResizable(false);*/
        
        //Border Layout
        JFrame border = new JFrame("Border LAyout");
        border.setLayout(new BorderLayout());
        border.add(new JButton("North"),BorderLayout.NORTH);
        border.add(new JButton("South"),BorderLayout.SOUTH);
        border.add(new JButton("East"),BorderLayout.EAST);
        border.add(new JButton("West"),BorderLayout.WEST);
        border.add(new JButton("Center"),BorderLayout.CENTER);
        border.pack();
        border.setVisible(true);
        border.setResizable(true);
        
    }
        
                
   
     
    
}

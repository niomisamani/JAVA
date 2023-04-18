/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExperiments;

/**
 *
 * @author niomi
 */
import java.awt.event.*;
import javax.swing.*;
public class Exp16M extends JFrame implements MouseListener{
    public Exp16M()
    {
        addMouseListener(this);
        setSize(200,200);
        setVisible(true);
        
    }
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Mouse Clicked at (" + e.getX() + "," + e.getY() + ")");
    }
    public void mouseEntered(MouseEvent e) {System.out.println("Mouse Entered");};
    public void mouseExited(MouseEvent e) {System.out.println("Mouse Exit");};
    public void mousePressed(MouseEvent e) {System.out.println("Mouse pressed");};
    public void mouseReleased(MouseEvent e) {System.out.println("Mouse Released");} ;
    
    public static void main(String[] args) {
        new Exp16M();
    }
    
}

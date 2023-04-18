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
public class Exp16K extends JFrame implements KeyListener {
    public Exp16K()
    {
        addKeyListener(this);
        setSize(200,200);
        setVisible(true);
    }
    @Override
    public void keyPressed(KeyEvent e)
    {
        System.out.println("Key Pressed "+e.getKeyChar());
    }
    @Override
    public void keyTyped(KeyEvent e)
    {
        System.out.println("Key Typed ");
    }
    @Override
    public void keyReleased(KeyEvent e)
    {
        System.out.println("Key Released ");
    }
    public static void main(String[] args) {
        new Exp16K();
    }
    
        
        
    
    
}

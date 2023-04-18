/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExperiments;

/**
 *
 * @author niomi
 */
class MyThread extends Thread
{
    String name;
    public MyThread(String name)
    {
        this.name=name;
    }
    public void run()
    {
        for (int i=1 ; i<=5 ; i++)
        {
            System.out.println(name+ " : " + i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
    
}
public class Exp11 {
    public static void main(String[] args) {
        MyThread t1= new MyThread("Thread 1");
        MyThread t2= new MyThread("Thread 2");
        t1.start();
        t2.start();
        
        
    }
    
}

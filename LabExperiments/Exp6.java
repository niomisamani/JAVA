/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExperiments;

/**
 *
 * @author niomi
 */
interface employee{
    double calsalary();
}
class intern implements employee{
    int hrs=40;
    int rateph=1000;
    @Override
    public double calsalary() 
    {
        return hrs*rateph;
    }
    
}
class fulltime implements employee{
    int hrs=80;
    int rateph=1000;
    @Override
    public double calsalary() 
    {
        return hrs*rateph;
    }
    
}
public class Exp6 {
    public static void main(String[] args) {
        intern i = new intern();
        fulltime f =new fulltime();
        System.out.println("Salary of intern= "+ i.calsalary());
        System.out.println("Salary of fulltime= "+ f.calsalary());
        
        
        
    }
        
    
}

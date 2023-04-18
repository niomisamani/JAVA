/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExperiments;

/**
 *
 * @author niomi
 */
public class Exp8 {
    int num;
    //consturctor
    public Exp8(int num)
    {
        this.num=num;
        System.out.println("Obj Created . Number is: "+num);
    }
    //destructor
    @Override
    protected void finalize()
    {
        System.out.println("Obj Destroyed. Numbers was: "+num);
    }
    public static void main(String[] args) {
        Exp8 obj = new Exp8(42);
        System.out.println("Number is "+obj.num);
        obj=null;
        System.gc();
    }
}

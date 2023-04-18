/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExperiments;

/**
 *
 * @author niomi
 */
class Addition
{
    int num1 , num2;
    int add()
    {
        return num1+num2;
    }
}
public class Exp1 {
    public static void main(String[] args)
    {
        Addition adder = new Addition();
        adder.num1 = 10;
        adder.num2 = 20;
        int sum = adder.add();
        System.out.println("Sum = "+sum);
    }
    
}

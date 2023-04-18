/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExperiments;
import java.util.Scanner;

/**
 *
 * @author niomi
 */
public class Exp10 {
    public static void main(String[] args) throws Exception {
        Scanner ip= new Scanner(System.in);
        try{
            System.out.println("Enter numerator");
            int num=ip.nextInt();
            System.out.println("Enter denomenator");
            int den=ip.nextInt();
            if(den==0)
            {
                throw new Exception("Cant divide by 0");
                
            }
            int result = num / den ;
            System.out.println("Result : "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error :"+e.getMessage());
            
        }
        finally{
            System.out.println("Finally block executed");
        }
            
            
            
       
    }
    
}

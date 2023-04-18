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
public class Exp3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //Factorial
        System.out.println("Enter a number to find its factorial");
        int a=s.nextInt();
        int fact=1;
        while(a>=1)
        {
            fact=a*fact;
            a--;
        }
        System.out.println("Factorial = "+fact);
        //Fibonacci
        System.out.println("Enter a number of terms in fibonacci series");
        int b=s.nextInt();
        int t1=0 , t2=1;
        System.out.println("Fib Series :\n"+t1+"\n"+t2);
        int i=2;
        while(i<b)
        {
            int sum=t1+t2;
            System.out.println(sum);
            t1=t2;
            t2=sum;
            i++;
            
        }
        //sum of digits
        System.out.println("Enter a number to find sum of its digits");
        int c=s.nextInt();
        int sumdig = 0;
        while(c>0)
        {
            int rem=c%10;
            sumdig= sumdig+rem;
            c=c/10;
        }
        System.out.println("Sum of digits = "+ sumdig);
            
            
        
        
        
        
    }
    
}

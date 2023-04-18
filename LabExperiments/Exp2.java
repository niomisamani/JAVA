/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExperiments;

/**
 *
 * @author niomi
 */
public class Exp2 {
    public static void main(String[] args) {
        //if-else
        int a=10;
        if (a>0)
        {
            System.out.println("It is a positive number");
        }
        else
        {
            System.out.println("It is a negative number");
        }
        //switch
        int b=2;
        switch(b)
        {
            case 1 : 
                System.out.println("b=1");
                break;
            case 2 :
                System.out.println("b=2");
                break;
            default : 
                System.out.println("b!=1 | b!=2");
                
        }
        //for loop
        
        for(int i=1 ; i<=5 ; i++)
        {
            System.out.println("Value of i = "+i);
        }
        //while loop
        int j=1;
        while (j<=5)
        {
            System.out.println("Value of j= "+j);
        }
        //do-while
        int k =1;
        do 
        {
            System.out.println("Value of k= "+k);
            k++;
        }
        while(k<=5);
        //continue statement
        int h;
        for(h=1 , h<=5 , h++)
        {
            if(h==3)
            {
                continue;
            }
            System.out.println("Value of h = "+h);
        }
        //break
        for(int h=1 , h<=5 , h++)
        {
            if(h==3)
            {
                break;
            }
            System.out.println("Value of h = "+h);
        }
        
                
        
    }
}

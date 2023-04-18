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
public class Exp4 {
    int id;
    String name;
    int marks1,marks2,marks3;
    public void setData(int id,String name,int marks1,int marks2,int marks3)
    {
        this.id=id;
        this.name=name;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        
    }
    public void displayData()
    {
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("Subject 1 Marks= "+marks1);
        System.out.println("Subject 2 Marks= "+marks2);
        System.out.println("Subject 3 Marks= "+marks3);
        System.out.println("Average Marks of 3 Subjects= "+(marks1+marks2+marks3)/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id of the student :");
        int no=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name of the student :");
        String n=sc.nextLine();
        System.out.println("Enter marks of subject 1 :");
        int m1=sc.nextInt();
        System.out.println("Enter marks of subject 2 :");
        int m2=sc.nextInt();
        System.out.println("Enter marks of subject 3 :");
        int m3=sc.nextInt();
        Exp4 student=new Exp4();
        student.setData(no,n,m1,m2,m3);
        student.displayData();
        
        
        
        
                
    }
                
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExperiments;

/**
 *
 * @author niomi
 */
public class Exp12 {
    public static void main(String[] args) {
        String s = "Sam";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.startsWith("S"));
        System.out.println(s.endsWith("n"));
        System.out.println(s.charAt(0));
        System.out.println(s.length());
        
        int a = 10;
        String s1 = String.valueOf(a);
        System.out.println(s1+11);
        
        String s2="Java is easy.";
        System.out.println(s2.replace("easy", "hard"));
        
        String str1="hello";
        String str2="hello";
        String str3="Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        
                
    }
    
}

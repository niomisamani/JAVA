/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabExperiments;

/**
 *
 * @author niomi
 */
class person{
    String name;
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
}
class employee extends person
{
    int Id;
    void setEmployee(int Id)
    {
        this.Id=Id;
    }
    int getEmployee()
    {
        return Id;
    }
}
class manager extends employee
{
    int salary;
    void setSal(int salary)
    {
        this.salary=salary;
    }
    int getSal()
    {
        return salary;
    }
}
interface bonus
{
    double bonus=0.1;
    double calcbonus();
}
class salesmanager extends manager implements bonus
{
    float sales;
    void setSales(float sales)
    {
        this.sales=sales;
        
    }
    float getSales()
    {
        return sales;
    }
    public double calcbonus()
    {
        return sales*bonus;
    }
}
public class Exp5 {
    public static void main(String[] args) {
        salesmanager sm = new salesmanager();
        sm.setName("Sam");
        sm.setEmployee(1001);
        sm.setSal(10000);
        sm.setSales(2000);
        System.out.println("Name: "+sm.getName());
        System.out.println("Id: "+sm.getEmployee());
        System.out.println("Salary: "+sm.getSal());
        System.out.println("Sales: "+sm.getSales());
        System.out.println("Bonus: "+sm.calcbonus());
        
        
    }
    
}

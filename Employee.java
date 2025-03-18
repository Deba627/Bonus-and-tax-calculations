/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package access.modifiers;

/**
 *
 * @author DEBA
 */
//25.	Create a class Employee with public salary, private bonus, and protected tax().
//Input: salary = 50000, bonus = 5000
// Output: "Salary: 50000, Bonus: 5000"
import java.util.Scanner;

public class Employee {

    public double salary = 0;
    private final double bonus = 5000;    //literal, the value is initialized so, literal
    public final double taxes = 0.10;

//    salary of employee with bonus
    public double sal(double userSalary) {

        salary += userSalary;
        System.out.println("The Employee Salary: " + salary);
        System.out.println("You will get the Bonus of: " + bonus);
        salary += bonus;
        System.out.println("Total Salary after adding bonus is: " + salary);
        return salary;
    }
//    calculate tax after getting salary and bonus and give the net pay

    protected double calTax(double tax) {        //double netPay
        tax = salary * taxes;
        System.out.println("The tax will be deducted from you salary " + salary + " is: " + tax);
        return tax;
    }
//        netPay = salary - tax;
//        System.out.println("The net pay of this Month is: ");
//        return netPay;

//     method to give the net pay after tax dedcution
    public double taxDeduction(double tax) {
        double pay = tax * salary;              // we are using the method calTax, because it giving the value of tax
//        System.out.println("The Net pay of this Month you will get: " + tax);
        return salary - pay;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Enter you Salary: ");
        double income = sc.nextDouble();
        emp.sal(income);        // method will give me the total income after adding bonus
        double tax = emp.taxes; // tax of the salary, emp.takes 0.10 is store in tax
        emp.calTax(tax);       // value of tax
        // constant tax value 0.10, so we declare a variable(tax) which is storing the tax values
        System.out.println("The Net pay of this Month you will get: "+ emp.taxDeduction(tax));

        
        
        
        
        
        
        
//        so now we have tax amount and income
//        to get the net pay we need to , to perform (income - tax)
//so basically what we did is we called the salary from class which was storing the total salary of a employee
//after adding bonus, and we subtracted with a method calTax(tax) which was giving me a tax values and got the netPay
//        double netPay = emp.salary - emp.calTax(tax);   // salary(50000) - emp.calTax(tax) 5500
//        System.out.println("The Net pay of this Month you will get: " + netPay);
    }

}

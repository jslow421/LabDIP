/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

import java.text.NumberFormat;

/**
 *
 * @author John
 */
public class Startup {
    public static void main(String[] args) {
        
    
    Employee emp1 = new HourlyEmployee(10.50, 2020);
        Employee emp2 = new SalariedEmployee(45000, 1250);
        Employee emp3 = new SalariedEmployee(90000,0);
        
        Employee[] employees = {emp1, emp2, emp3};
        
        HumanResources hr = new HumanResources();
        
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
         for(int e=0; e < employees.length; e++) {
            System.out.println("Employee " + (e+1) + " compensation:" +
            nf.format(hr.annualCompensationPerEmployee(employees[e])));
        }
    }
}

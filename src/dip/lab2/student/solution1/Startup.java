/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author John
 */
public class Startup {
    public static void main(String[] args) {
        
        
        Service bag1 = new Bag(Bag.ServiceQuality.GOOD, 5);
        
        Calculator tipCalc = new Calculator();
        
        System.out.println("Total tip is: " + tipCalc.calculateTip(bag1));
        
        
        
    }
    
}

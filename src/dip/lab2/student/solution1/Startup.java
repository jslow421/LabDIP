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
        Service bag2 = new Bag(Bag.ServiceQuality.FAIR, 5);
        
        Service food1 = new Food(Food.ServiceQuality.GOOD, 20);
        
        Calculator tipCalc = new Calculator();
        
        System.out.println("Total tip is: " + tipCalc.calculateTip(bag1));
        System.out.println("Total tip is: " + tipCalc.calculateTip(bag2));
        System.out.println("Total tip is: " + tipCalc.calculateTip(food1));
        
        
        
        
    }
    
}

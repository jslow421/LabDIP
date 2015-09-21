/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class ScreenReader implements Input{
    @Override
    public String readln(){
        System.out.println("Enter the message you would like to send: ");
        
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }
    
}

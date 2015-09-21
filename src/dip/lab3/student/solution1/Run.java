/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author John
 */
public class Run {
    public static void main(String[] args) {
        Reader reader = new ScreenReader();
        Writer writer = new ConsoleWriter();
        
        Messager message1 = new Messager(reader, writer);
        
        message1.message();
    }
}

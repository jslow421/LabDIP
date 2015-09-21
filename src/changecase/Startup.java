/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changecase;

/**
 *
 * @author jslowik
 */
public class Startup {
    public static void main(String[] args) {
        //create formatter using LSP
        CaseFormatter f = new LowerCaseFormatter(); //can apply any formatter change it to see
        TextCaseService srv = new TextCaseService();
        srv.setFormatter(f);
        String s = srv.changeCase("HELLO WORLD");
        System.out.println(s);
        
        //have flexible code that can be easily changed
        //when a change is made it doesn't break
        //anybody could use this in their program w/o problems
        //meets all three DIP criteria
    }
}

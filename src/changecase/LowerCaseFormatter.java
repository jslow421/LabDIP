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
public class LowerCaseFormatter implements CaseFormatter {
    @Override
    public String changeCase(String origString){ //use change case rather than ToUpperCase
        return origString.toLowerCase();
    }
    
    //these both now share the same method signature with a different body
    //Lower and Upper are now our low level classes in the DIP
    //now that they are identical they are polymorphic
}

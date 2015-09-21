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
public class UpperCaseFormatter implements CaseFormatter{
    @Override
    public String changeCase(String origString){ //use change case rather than ToUpperCase
        return origString.toUpperCase();
    }
}

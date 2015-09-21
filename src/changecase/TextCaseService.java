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
public class TextCaseService {
    //this is the high level module in the DIP
    //it will talk to the low level modules through the abstractions
    //LSP means we use the interface - the abstraction of a low level
    private CaseFormatter formatter;
    
    
    public String changeCase(String origString){ 
        return formatter.changeCase(origString); 
        //^the boss doesn't care which object does the change, just wants it done
        //correct formatter is chosen in a different class (startup)
    }

    public CaseFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(CaseFormatter formatter) {
        this.formatter = formatter;
    }
    
}

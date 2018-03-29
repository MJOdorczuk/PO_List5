/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list5;

import java.util.HashMap;

/**
 *
 * @author MJOdorczuk
 */
public class Subtraction extends CalNode {
    public Subtraction(CalNode[] components, HashMap<Character,Double> variables) {
        super(components, variables);
    }
    
    @Override
    public double calculate() {
        if(components.length > 1) return components[0].calculate() - components[1].calculate();
        if(components.length == 1) return components[0].calculate();
        return 0;
    }

    @Override
    public String toString() {
        String ret = "";
        if(components.length > 0) ret += "(" + components[0].toString() + ")";
        if(components.length > 1) ret += "-(" + components[1].toString() + ")";
        return ret;
    }
}

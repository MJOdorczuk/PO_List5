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
public class Variable extends CalNode {
    
    private final Character Variable_Name;
    public Variable(CalNode[] components, HashMap<Character,Double> variables, Character Variable_Name) {
        super(components, variables);
        this.Variable_Name = Variable_Name;
    }

    @Override
    public double calculate() {
        return this.variables.get(Variable_Name);
    }

    @Override
    public String toString() {
        return Variable_Name.toString();
    }
}

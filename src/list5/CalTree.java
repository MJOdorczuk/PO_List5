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
public class CalTree {
    
    private final CalNode tree;
    private final HashMap<Character, Double> variables;

    public CalTree(CalNode tree, HashMap<Character, Double> variables) {
        this.tree = tree;
        this.variables = variables;
    }
    public void addVariable(Character key, Double value)
    {
        this.variables.put(key, value);
    }
    public double calculate()
    {
        return this.tree.calculate();
    }
    @Override
    public String toString()
    {
        return this.tree.toString();
    }
    
}

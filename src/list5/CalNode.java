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
public abstract class CalNode {
    protected final CalNode[] components;
    protected final HashMap<Character,Double> variables;
    CalNode(CalNode[] components, HashMap<Character,Double> variables)
    {
        this.components = components;
        this.variables = variables;
    }
    public abstract double calculate();
    @Override
    public abstract String toString();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author MJOdorczuk
 */
public abstract class CalNode {
    protected ArrayList<CalNode> components;
    protected final HashMap<Character,Double> variables;
    public CalNode(CalNode[] components, HashMap<Character,Double> variables)
    {
        this.components.clear();
        this.components.addAll(Arrays.asList(components));
        this.variables = variables;
    }
    public void setCalNode(CalNode[] components)
    {
        this.components.clear();
        this.components.addAll(Arrays.asList(components));
    }
    public void addCalNode(CalNode component)
    {
        this.components.add(component);
    }
    public abstract double calculate();
    @Override
    public abstract String toString();
}

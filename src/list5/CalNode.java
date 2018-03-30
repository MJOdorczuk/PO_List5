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
    protected HashMap<Character,Double> variables;
    public CalNode(CalNode[] components)
    {
        this.components = new ArrayList<>();
        if(components != null)
            this.components.addAll(Arrays.asList(components));
        variables = null;
    }
    public void setCalNode(CalNode[] components)
    {
        this.components.clear();
        this.components.addAll(Arrays.asList(components));
    }
    public void addCalNode(CalNode component)
    {
        this.components.add(component);
        component.setVariableMap(variables);
    }
    public abstract Double calculate();
    @Override
    public abstract String toString();
    public void setVariableMap(HashMap<Character,Double> variables)
    {
        this.variables = variables;
        components.forEach((component) -> {
            component.setVariableMap(variables);
        });
    }
    public void addVariable(Character key, Double value)
    {
        this.variables.put(key, value);
    }
    public HashMap<Character, Double> getVariables()
    {
        return this.variables;
    }
}

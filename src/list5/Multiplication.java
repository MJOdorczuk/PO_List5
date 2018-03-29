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
public class Multiplication extends CalNode{

    public Multiplication(CalNode[] components, HashMap<Character,Double> variables) {
        super(components, variables);
    }

    @Override
    public double calculate() {
        double ret = 1;
        for (CalNode component : components) {
            ret *= component.calculate();
        }
        return ret;
    }
    @Override
    public String toString() {
        String ret = "";
        if(components.length > 0) ret += "(" + components[0].toString() + ")";
        for(int i=1; i<components.length; i++)
        {
            ret += "*(" + components[i].toString() + ")";
        }
        return ret;
    }
}
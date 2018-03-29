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
public class Constant extends CalNode{

    private final Double constant;
    public Constant(CalNode[] components, HashMap<Character,Double> variables, Double constant) {
        super(components, variables);
        this.constant = constant;
    }

    @Override
    public double calculate() {
        return constant;
    }

    @Override
    public String toString() {
        return constant.toString();
    }
    
}

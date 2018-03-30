/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list5;

/**
 *
 * @author MJOdorczuk
 */
public class Constant extends CalNode{

    private final Double constant;
    public Constant(CalNode[] components, Double constant) {
        super(components);
        this.constant = constant;
    }

    @Override
    public Double calculate() {
        return constant;
    }

    @Override
    public String toString() {
        return constant.toString();
    }
    
}

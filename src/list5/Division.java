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
public class Division extends CalNode{
    public Division(CalNode[] components) {
        super(components);
    }
    
    @Override
    public Double calculate() {
        if(components.size() > 1) return components.get(0).calculate() / components.get(1).calculate();
        if(components.size() == 1) return components.get(0).calculate();
        return 1.;
    }

    @Override
    public String toString() {
        String ret = "";
        if(components.size() > 0) ret += "(" + components.get(0).toString() + ")";
        if(components.size() > 1) ret += "/(" + components.get(1).toString() + ")";
        return ret;
    }
    
}

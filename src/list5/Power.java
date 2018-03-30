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
public class Power extends CalNode{
    
    public Power(CalNode[] components) {
        super(components);
    }

    @Override
    public Double calculate() {
        if(components.isEmpty()) return 1.;
        double ret = components.get(0).calculate();
        for (int i=1; i<components.size(); i++) {
            ret = Math.pow(ret, components.get(i).calculate());
        }
        return ret;
    }
    @Override
    public String toString() {
        String ret = "";
        if(components.size() > 0) ret += "(" + components.get(0).toString() + ")";
        for(int i=1; i<components.size(); i++)
        {
            ret += "^(" + components.get(i).toString() + ")";
        }
        return ret;
    }
}

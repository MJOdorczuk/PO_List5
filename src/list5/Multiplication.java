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
public class Multiplication extends CalNode{

    public Multiplication(CalNode[] components) {
        super(components);
    }

    @Override
    public Double calculate() {
        double ret = 1;
        ret = components.stream().map((component) -> component.calculate()).reduce(ret, (accumulator, _item) -> accumulator * _item);
        return ret;
    }
    @Override
    public String toString() {
        String ret = "";
        if(components.size() > 0) ret += "(" + components.get(0).toString() + ")";
        for(int i=1; i<components.size(); i++)
        {
            ret += "*(" + components.get(i).toString() + ")";
        }
        return ret;
    }
}

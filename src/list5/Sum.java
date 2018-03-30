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
public class Sum extends CalNode{
    
    public Sum(CalNode[] components) {
        super(components);
    }
    
    @Override
    public Double calculate() {
        double sum = 0;
        sum = components.stream().map((component) -> component.calculate()).reduce(sum, (accumulator, _item) -> accumulator + _item);
        return sum;
    }

    @Override
    public String toString() {
        String ret = "";
        if(!components.isEmpty()) ret += "(" + components.get(0).toString() + ")";
        for(int i=1; i<components.size(); i++)
        {
            ret += "+(" + components.get(i).toString() + ")";
        }
        return ret;
    }
    
}

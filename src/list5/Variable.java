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
public class Variable extends CalNode {
    
    private final Character Variable_Name;
    public Variable(CalNode[] components, Character Variable_Name) {
        super(components);
        this.Variable_Name = Variable_Name;
    }

    @Override
    public Double calculate() {
        return this.variables.get(Variable_Name);
    }

    @Override
    public String toString() {
        return Variable_Name.toString();
    }
}

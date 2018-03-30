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
public class List5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue testcol = new Queue();
        testcol.join(new Lieutenant());
        testcol.join(new Brigadier());
        testcol.join(new Field_Marshal());
        testcol.join(new Major());
        testcol.join(new Field_Marshal());
        testcol.join(new Lieutenant());
        testcol.join(new Major());
        testcol.join(new Brigadier());
        System.out.print(testcol.toString());
        
        Sum sum = new Sum(null);
        Division div = new Division(null);
        Multiplication mul = new Multiplication(null);
        Power pow = new Power(null);
        Subtraction sub = new Subtraction(null);
        Variable three = new Variable(null,'3');
        sum.addCalNode(div);
        sum.addCalNode(mul);
        div.addCalNode(pow);
        div.addCalNode(new Variable(null,'5'));
        pow.addCalNode(new Constant(null,5.));
        pow.addCalNode(three);
        mul.addCalNode(new Constant(null,2.));
        mul.addCalNode(sub);
        sub.addCalNode(three);
        sub.addCalNode(new Constant(null,4.));
        HashMap<Character, Double> hm = new HashMap<>();
        hm.put('3', 3.);
        hm.put('5', 5.);
        sum.setVariableMap(hm);
        System.out.print(sum.toString() + " = " + sum.calculate() + "\n");
    }
    
}

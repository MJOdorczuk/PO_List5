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
public class Field_Marshal extends Rank {

    @Override
    public int compareTo(Object o) {
        if(o instanceof Field_Marshal) return 1;
        return -1;
    }
    
}

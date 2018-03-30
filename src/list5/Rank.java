/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list5;

/**
 *
 * @author MJOdorczuk
 * 
 * Implemented ranks are Field Marshal, Lieutenant, Major and Brigadier
 */
public abstract class Rank implements Comparable {

    //Everything that is not of type Rank has lower rank than Rank objects
    //1 means that the rank of this first object is higher
    //0 means that both ranks are equivalent
    //-1 means that the rank of this first object is lower
    public int compareToRank(Rank o){
        if(this.rank() > o.rank()) return 1;
        if(this.rank() == o.rank()) return 0;
        return -1;
    }
    @Override
    public int compareTo(Object o){
        if(o instanceof Rank) return this.compareToRank(Rank.class.cast(o));
        return -1;
    }
    
    //The higher value of rank() the higher the rank.
    public abstract double rank();
    @Override
    public abstract String toString();
}

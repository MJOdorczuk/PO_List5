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
public class Lieutenant extends Rank {

    @Override
    public double rank()
    {
        return 1;
    }
    @Override
    public String toString()
    {
        return "Lieutenant";
    }
}

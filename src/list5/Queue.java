/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list5;

/**
 *
 * @author MJOdorczuk
 * @param <T>
 */
public class Queue<T extends Comparable> {
    private Element<T> least;
    
    public void join(T elem)
    {
        Element<T> temp = this.least;
        if(this.least == null) this.least = new Element<>(elem, null);
        else
        {
            while(temp.compareTo(elem) < 0)
            {
                temp = temp.bigger();
            }
            temp.bigger(new Element<>(elem, temp.bigger()));
        }
    }
    public T get()
    {
        T ret = this.least.value();
        this.least = this.least.bigger();
        return ret;
    }
    
}

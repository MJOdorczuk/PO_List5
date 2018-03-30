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
        if(temp == null) this.least = new Element<>(elem, null);
        else
        {
            if(temp.compareTo(elem) > 0)
            {
                this.least = new Element<>(elem, temp);
            }
            else if(temp.bigger() == null)
            {
                temp.bigger(new Element<>(elem,null));
            }
            else
            {
                Element<T> next = temp.bigger();
                while(next!=null)
                {
                    if(next.compareTo(elem) > 0)
                    {
                        temp.bigger(new Element<>(elem,next));
                        return;
                    }
                    temp = next;
                    next = next.bigger();
                }
                temp.bigger(new Element<>(elem,null));
            }
            
        }
    }
    public T get()
    {
        T ret = this.least.value();
        this.least = this.least.bigger();
        return ret;
    }
    @Override
    public String toString()
    {
        Element<T> temp = this.least;
        String ret = "";
        while(temp!=null)
        {
            ret += temp.toString() + "\n";
            temp = temp.bigger();
        }
        return ret;
    }
}

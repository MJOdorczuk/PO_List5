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
public class Element<T extends Comparable> {
    private final T value;
    private Element<T> bigger;
    
    public Element(T value, Element<T> bigger)
    {
        this.value = value;
        this.bigger = bigger;
    }
    public Element<T> bigger()
    {
        return this.bigger;
    }
    public T value()
    {
        return this.value;
    }
    public void bigger(Element<T> bigger)
    {
        this.bigger = bigger;
    }
    public int compareTo(T comp)
    {
        return this.value.compareTo(comp);
    }
    @Override
    public String toString()
    {
        return this.value.toString();
    }
}

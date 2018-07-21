package IteratorPattern;

/**
 * Created by kxyu on 2018/7/21
 */
public interface List {

    public void add(Object o);
    public Object get(int index);
    public int getSize();
    public Iterator iterator();
}

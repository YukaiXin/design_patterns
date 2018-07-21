package IteratorPattern;

/**
 * Created by kxyu on 2018/7/21
 */
public class ConcreteAggregate implements List {

    private Object[] objects;
    private int      index  ;
    private int      size   ;

    public ConcreteAggregate() {
        index   = 0;
        size    = 0;
        objects = new Object[100];
    }

    @Override
    public void add(Object o) {
        size ++;
        objects[index++] = o;
    }

    @Override
    public Object get(int index) {

        return objects[index];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Iterator iterator() {

        return new ConcreteIterator(this);
    }
}

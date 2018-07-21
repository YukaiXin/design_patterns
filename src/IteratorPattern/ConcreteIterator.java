package IteratorPattern;




/**
 * Created by kxyu on 2018/7/21
 */
public class ConcreteIterator implements Iterator {

     private List list = null;
     private int index;

    @Override
    public boolean hasNext() {

        return index >= list.getSize()? false : true;
    }

    @Override
    public Object next() {

        Object object = list.get(index);
        index++;
        return  object;
    }

    public ConcreteIterator(List list) {
        this.list = list;
    }


}

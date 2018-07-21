package IteratorPattern;

public class iteratorMain {

    public static void main(String[] args) {

        List list = new ConcreteAggregate();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

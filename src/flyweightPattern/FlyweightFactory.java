package flyweightPattern;

import java.util.Hashtable;

/**
 * Created by kxyu on 2018/7/24
 */
public class FlyweightFactory {

    private Hashtable flyweights = new Hashtable();

    private static FlyweightFactory instance = null;

    public static FlyweightFactory getInstance(){
        if(instance == null){
            instance = new FlyweightFactory();
        }
        return instance;
    }

    public FlyweightFactory() {
    }

    public Flyweight getFlyweight(Object o){
            Flyweight flyweight = (Flyweight) flyweights.get(o);
        if(flyweight == null){
            flyweight = new ConcreteFlyweight((String) o);
            flyweights.put(o, flyweight);
        }
        return flyweight;
    }

    public int getFlyweightSize(){
        return flyweights.size();
    }
}

package flyweightPattern;

/**
 * Created by kxyu on 2018/7/24
 */
public class ConcreteFlyweight extends Flyweight {

    private String flyweightStr;

    public ConcreteFlyweight(String string) {
        flyweightStr = string;
    }

    @Override
    public void operation() {
        System.out.println("  string  : "+flyweightStr);
    }
}

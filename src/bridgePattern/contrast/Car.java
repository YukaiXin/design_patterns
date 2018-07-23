package bridgePattern.contrast;

/**
 * Created by kxyu on 2018/7/23
 */
public abstract class Car {

    protected Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    abstract void installEngine();
}

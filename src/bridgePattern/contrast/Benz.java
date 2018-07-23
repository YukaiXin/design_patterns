package bridgePattern.contrast;

/**
 * Created by kxyu on 2018/7/23
 */
public class Benz extends Car {

    public Benz(Engine engine) {
        super(engine);
    }

    @Override
    void installEngine() {
        System.out.print("奔驰安装");
        engine.addEngine();
    }
}

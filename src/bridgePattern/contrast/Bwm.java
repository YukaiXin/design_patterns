package bridgePattern.contrast;

/**
 * Created by kxyu on 2018/7/23
 */
public class Bwm extends Car {

    public Bwm(Engine engine) {
        super(engine);
    }

    @Override
    void installEngine() {
        System.out.print("宝马安装");
        engine.addEngine();
    }
}

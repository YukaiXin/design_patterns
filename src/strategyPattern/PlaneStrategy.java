package strategyPattern;

/**
 * Created by kxyu on 2018/7/19
 */
public class PlaneStrategy implements Strategy{
    @Override
    public void travel() {
        System.out.print("出游方式为 飞机");
    }
}

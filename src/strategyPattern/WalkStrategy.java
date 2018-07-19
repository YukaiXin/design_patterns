package strategyPattern;

/**
 * Created by kxyu on 2018/7/19
 */
public class WalkStrategy implements Strategy{
    @Override
    public void travel() {
        System.out.println("出游方式为 步行 ");
    }
}

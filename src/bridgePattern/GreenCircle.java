package bridgePattern;

/**
 * Created by kxyu on 2018/7/23
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {

        System.out.println("绿圆   x : "+x+" y : "+y);
    }
}

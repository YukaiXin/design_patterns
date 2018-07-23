package bridgePattern;

/**
 * Created by kxyu on 2018/7/23
 */
public class Circle extends Shape implements Cloneable{

    int x;
    int y;
    int radius;


    protected Circle(int radius, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

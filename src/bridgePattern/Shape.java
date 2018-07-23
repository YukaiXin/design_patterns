package bridgePattern;

/**
 * Created by kxyu on 2018/7/23
 */
public abstract class Shape {
    
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    protected void setDrawAPI(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}

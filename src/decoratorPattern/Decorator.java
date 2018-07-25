package decoratorPattern;

/**
 * Created by kxyu on 2018/7/25
 */
public class Decorator implements Component {

    public Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void biu() {
        component.biu();
    }

}

package decoratorPattern;

/**
 * Created by kxyu on 2018/7/25
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    public  void biu(){
        System.out.println("ready? go !!!");
        this.component.biu();
    }
}

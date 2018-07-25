package decoratorPattern;

public class decoratorMain {

    public static void main(String[] args) {

        Component component = new ConcreteDecorator(new ConcreteComponent());
        component.biu();

    }
}

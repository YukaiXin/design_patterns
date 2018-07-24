package flyweightPattern;

public class flyweightMain {

    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

        Flyweight flyweight1;
        Flyweight flyweight2;
        Flyweight flyweight3;
        Flyweight flyweight4;

        flyweight1 = flyweightFactory.getFlyweight("kxyu");
        flyweight2 = flyweightFactory.getFlyweight("yukaixin");
        flyweight3 = flyweightFactory.getFlyweight("kxyu");
        flyweight4 = flyweightFactory.getFlyweight("kxyu");


        flyweight1.operation();
        flyweight2.operation();
        flyweight3.operation();
        flyweight4.operation();

        System.out.println("\n Flyweight Size : " + flyweightFactory.getFlyweightSize());

    }
}

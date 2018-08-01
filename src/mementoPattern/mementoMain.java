package mementoPattern;

/**
 * Created by kxyu on 2018/8/1
 */
public class mementoMain {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        Originator orig = new Originator();

        orig.setState("状态一");
        careTaker.add(orig.saveToMemento());

        orig.setState("状态二");
        careTaker.add(orig.saveToMemento());

        orig.setState("状态三");
        careTaker.add(orig.saveToMemento());

        System.out.println("状态历史：");
        for(Memento m:careTaker.getMementoList()){
            System.out.println(m.getState());
        }

        System.out.println("当前状态：");
        System.out.println(orig.getState());
        orig.setState(careTaker.getMementoList().get(careTaker.getMementoList().size() - 2).getState());
        System.out.println("恢复后的状态：");
        System.out.println(orig.getState());

    }
}

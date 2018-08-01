package mementoPattern;

/**
 * Created by kxyu on 2018/8/1
 */
public class Originator {

    private String state;

    //保存到备忘录
    public Memento saveToMemento(){
        return new Memento(state);
    }

    //返回备忘录状态
    public void restoreFromMemento(Memento memento){
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

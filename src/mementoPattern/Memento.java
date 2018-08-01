package mementoPattern;

/**
 * Created by kxyu on 2018/8/1
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

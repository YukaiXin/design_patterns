package ObserverPattern;

/**
 * Created by kxyu on 2018/7/17
 */
public interface Observer<T> {
    void onUpdate(Observable<T> observable,T data);
}

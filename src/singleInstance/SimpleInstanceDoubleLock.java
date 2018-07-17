package singleInstance;

/**
 * Created by kxyu on 2018/7/17
 */

/**
 *双重校验锁
 */

public class SimpleInstanceDoubleLock {

    private volatile static SimpleInstanceDoubleLock instance;

    public static SimpleInstanceDoubleLock getSingletonDemo7(){
        if (instance == null) {
            synchronized (SimpleInstanceDoubleLock.class) {
                if (instance == null) {
                    instance = new SimpleInstanceDoubleLock();
                }
            }
        }
        return instance;
    }

}

package singleInstance;

/**
 * 懒汉式单例模式：在类加载时不初始化。
 * 线程安全
 *
 * 效率很低（因为锁），并且大多数情况下不需要同步
 */

public class SimpleSingleInstanceSafe {

    private static SimpleSingleInstanceSafe instance;


    public synchronized static SimpleSingleInstanceSafe getInstance(){

        if(instance == null){
            instance = new SimpleSingleInstanceSafe();
        }

        return instance;
    }

}

package singleInstance;

/**
 * 懒汉式单例模式：在类加载时不初始化。
 * 线程不安全
 */

public class SimpleSingleInstance {

    private static SimpleSingleInstance instance;


    public static  SimpleSingleInstance getInstance(){

        if(instance == null){
            instance = new SimpleSingleInstance();
        }

        return instance;
    }

}

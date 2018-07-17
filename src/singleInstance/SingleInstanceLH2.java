package singleInstance;

/**
 * 饿汉，变种
 *
 */

public class SingleInstanceLH2 {

    private static SingleInstanceLH2 instance ;

    static {
        instance = new SingleInstanceLH2();
    }

    public static SingleInstanceLH2 getInstance(){

        return instance;
    }

}

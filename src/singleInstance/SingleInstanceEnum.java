package singleInstance;

/**
 * Created by kxyu on 2018/7/17
 */

/**
 * 这种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒啊，
 * 不过，个人认为由于1.5中才加入enum特性，用这种方式写不免让人感觉生疏，在实际工作中，我也很少看见有人这么写过。
 *
 * 优点：  系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能。
 *
 * 缺点：  当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用new，可能会给其他开发人员造成困扰，特别是看不到源码的时候。
 *
 * 适用场合：
 *          需要频繁的进行创建和销毁的对象；
 *          创建对象时耗时过多或耗费资源过多，但又经常用到的对象；
 *          工具类对象；
 *          频繁访问数据库或文件的对象。
 */

public enum SingleInstanceEnum {

    instance;

    public void whateverMethod(){
    }

}

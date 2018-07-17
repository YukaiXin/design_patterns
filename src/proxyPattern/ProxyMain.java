package proxyPattern;

import proxyPattern.Bean.CivilianB;
import proxyPattern.Bean.ILawsuit;
import proxyPattern.Bean.CivilianA;
import proxyPattern.Bean.Lawyer;

import java.lang.reflect.Proxy;



public class ProxyMain {

    public static void main(String[] args) {


        /***
         *  静态代理
         */
        ILawsuit civilianA = new CivilianA();

        ILawsuit civilianB = new CivilianB();
        Lawyer lawyer = new Lawyer(civilianB);

        lawyer.burden();
        lawyer.defend();
        lawyer.submit();
        lawyer.finish();

        DynamicProxy proxy = new DynamicProxy(civilianA);
        ClassLoader loader = civilianA.getClass().getClassLoader();

        /***
         **    动态代理
         **    动态创建代理类，需要传入一个类加载器ClassLoader；一个你希望这个代理实现的接口列表，这里要代理ILawsuit接口；
         **    和一个InvocationHandler的实现，也就是前面创建的proxy。
         */
        ILawsuit lawyerA = (ILawsuit) Proxy.newProxyInstance(loader, new Class[]{ILawsuit.class}, proxy);

        lawyerA.defend();
        lawyerA.submit();
        lawyerA.burden();
        lawyerA.finish();

    }
}

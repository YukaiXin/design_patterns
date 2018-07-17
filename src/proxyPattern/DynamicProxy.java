package proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        if(method.getName().equals("submit")){
            Object result = method.invoke(object, args);

            return result;
        }else if (method.getName().equals("burden")){
            Object result = method.invoke(object, args);
            return result;
        }

        return null;
    }
}

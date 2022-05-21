package ir.edu.farhadi.java.j19.dynamicproxy.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AmazonInvocationHandler implements InvocationHandler {
    private Object amazonMediaManagement;

    public AmazonInvocationHandler(Object amazonMediaManagement) {
        this.amazonMediaManagement = amazonMediaManagement;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println( "Dynamic Proxy Class Name: " + proxy.getClass().getName() );
        Object result;
        System.out.println("Check All Validation And Policy Roles for method " + method.getName());
        System.out.println("Call Logging ! ... ");
        result = method.invoke(amazonMediaManagement, args);
        System.out.println("Method Was Success Calling ");
        return result;
    }

    public static Object getDynamicProxy(Object target) {
        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new AmazonInvocationHandler(target) );
    }
}

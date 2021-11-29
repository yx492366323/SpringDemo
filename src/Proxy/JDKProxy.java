package Proxy;

import Aspect.MyAspect;
import Dao.UserDao;
import Domain.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {

    private UserDao userDao;

    public Object creatProxy(UserDao userDao){
        this.userDao=userDao;
        //造一个类加载器。
        ClassLoader classLoader = JDKProxy.class.getClassLoader();
        //获取被代理对象的所有实现接口。
        Class[] classes = userDao.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader,classes,this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //声明切面类。
        MyAspect myAspect = new MyAspect();
        //前增强。
        myAspect.checkPermissions();
        //在目标类调用方法并传入参数。
        Object obj = method.invoke(userDao,args);
        //后增强。
        myAspect.log();
        return obj;
    }
}

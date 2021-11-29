package Proxy;

import Aspect.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLIBProxy implements MethodInterceptor {
    public Object creatProxy(Object target){
        //创建动态类对象。
        Enhancer enhancer = new Enhancer();
        //设置要增强的类为父类。
        enhancer.setSuperclass(target.getClass());
        //添加回调函数。
        enhancer.setCallback(this);
        //返回创建的代理类。
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //创建切面类对象。
        MyAspect myAspect = new MyAspect();
        //前增强。
        myAspect.checkPermissions();
        //执行目标方法。
        Object obj = methodProxy.invokeSuper(o,objects);
        //后增强。
        myAspect.log();
        return obj;
    }
}

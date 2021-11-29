package Aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class MyAOPAspect implements MethodInterceptor {
    public void checkPermissions() {
        System.out.println("MyAspect.checkPermissions()");
    }

    public void log() {
        System.out.println("MyAspect.log()");
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        checkPermissions();
        Object obj = methodInvocation.proceed();
        log();
        return obj;
    }

}

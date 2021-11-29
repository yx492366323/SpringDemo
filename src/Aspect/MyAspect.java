package Aspect;

//切面类
public class MyAspect {
    public void checkPermissions(){
        System.out.println("MyAspect.checkPermissions()");
    }
    public void log(){
        System.out.println("MyAspect.log()");
    }
}

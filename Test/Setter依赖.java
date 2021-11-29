//package Test;

import Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//所用到的包为Dao、Service
public class Setter依赖 {
    public static void main(String[] args){
        //初始化容器，加载配置文件。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        //通过容器获取Bean实例
        UserService userService = (UserService) applicationContext.getBean("userService");
        //调用userDao实例内的方法
        userService.addUser();
        userService.delUser();
    }
}

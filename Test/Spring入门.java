//package Test;

import Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//所用到的包为Dao
public class Spring入门 {
    public static void main(String[] args){
        //初始化容器，加载配置文件。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        //通过容器获取Bean实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //调用userDao实例内的方法
        userDao.addUser();
        userDao.delUser();
    }
}

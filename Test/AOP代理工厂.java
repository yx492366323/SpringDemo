import Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOP代理工厂 {
    public static void main(String[] args){
        //初始化容器，加载配置文件。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-AOP.xml");
        //通过容器获取Bean实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDaoProxy");
        //调用userDao实例内的方法
        userDao.addUser();
        userDao.delUser();
    }
}

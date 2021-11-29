import Domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean的XML装配 {

    public static void main(String[] args) {
        //初始化容器，加载配置文件。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        //通过容器获取Bean实例
        User user1 = (User) applicationContext.getBean("User1");
        User user2 = (User) applicationContext.getBean("User2");
        System.out.println(user1);
        System.out.println(user2);
    }
}
